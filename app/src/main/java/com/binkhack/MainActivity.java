package com.binkhack;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.binkhack.data.RxBinkHackApi;
import com.binkhack.databinding.ActivityMainBinding;
import com.binkhack.fragments.ProfileFragment;
import com.binkhack.fragments.WalletFragment;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private WalletFragment walletFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setSupportActionBar(binding.toolbar);
        binding.toolbar.setTitle("Wallet");

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            binding.toolbar.setElevation(0);
//        }

        setupFragments();
//        setupUser();

        binding.bottomNavigation.setOnTabSelectListener(tabId -> {
            switch (tabId) {
                case R.id.nav_wallet:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, walletFragment)
                            .commit();
                    break;
                case R.id.nav_profile:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, profileFragment)
                            .commit();
                    break;
            }
        });
    }

    private void setupUser() {
        RxBinkHackApi hackApi = new RxBinkHackApi();
        hackApi.getUser()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnError(throwable -> {
                    throwable.printStackTrace();
                    Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
                })
                .subscribe(user -> {
                    Toast.makeText(this, "User: " + user.getFirstName(),
                            Toast.LENGTH_SHORT).show();
                    HackUtils.setUser(user);
                });
    }

    private void setupFragments() {
        walletFragment = new WalletFragment();
        profileFragment = new ProfileFragment();
    }

    @Override
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }
    }
}
