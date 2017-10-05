package com.binkhack.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.binkhack.HackUtils;
import com.binkhack.R;
import com.binkhack.activities.AchievementActivity;
import com.binkhack.data.RxBinkHackApi;
import com.binkhack.databinding.FragmentProfileBinding;
import com.binkhack.model.User;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class ProfileFragment extends Fragment {

    public static final String USER = "user";

    private User user;
    private FragmentProfileBinding binding;

    public ProfileFragment() {
        // Required empty public constructor
    }

//    public static ProfileFragment newInstance(User user) {
//        Bundle args = new Bundle();
//        args.putParcelable(USER, user);
//
//        ProfileFragment fragment = new ProfileFragment();
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        binding = FragmentProfileBinding.bind(view);
        getActivity().setTitle("My Profile");
        if (((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("My Profile");
        }

//        setupClickListener();

//        animateIn();
//        setupCircleProgress();

        return view;
    }

    private void setupClickListener() {
        if (HackUtils.getUser() != null) {
            user = HackUtils.getUser();
        }

        binding.email.setText(user.getEmail());
        binding.binkPoints.setText(String.format("%d Bink Points", user.getLifetimeBalance()));

        if (user != null) {
            if (user.getLifetimeBalance() < 100) {
                binding.level.setText("1");
            } else if (user.getLifetimeBalance() < 200) {
                binding.level.setText("2");
            } else if (user.getLifetimeBalance() < 300) {
                binding.level.setText("3");
            } else if (user.getLifetimeBalance() < 400) {
                binding.level.setText("4");
            } else if (user.getLifetimeBalance() < 500) {
                binding.level.setText("5");
            } else if (user.getLifetimeBalance() < 600) {
                binding.level.setText("6");
            } else if (user.getLifetimeBalance() < 700) {
                binding.level.setText("7");
            } else if (user.getLifetimeBalance() < 800) {
                binding.level.setText("8");
            } else if (user.getLifetimeBalance() < 900) {
                binding.level.setText("9");
            }
        }

        binding.level.setOnClickListener(view -> showAchievements());
        binding.levelTitle.setOnClickListener(view -> showAchievements());
    }

    private void showAchievements() {
        Intent intent = new Intent(getActivity(), AchievementActivity.class);
        getActivity().startActivityForResult(intent, 1);
    }

    @Override
    public void onResume() {
        super.onResume();
        RxBinkHackApi hackApi = new RxBinkHackApi();
        hackApi.getUser()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnError(Throwable::printStackTrace)
                .subscribe(user -> {
                    HackUtils.setUser(user);
                    setupClickListener();
                });
    }

    //    private void setupCircleProgress() {
//        binding.progressBar.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimaryDark));
//        binding.progressBar.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
//        binding.progressBar.setProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width));
//        binding.progressBar.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width_togo));
//        int animationDuration = 2500; // 2500ms = 2,5s
//        binding.progressBar.setProgressWithAnimation(65, animationDuration);
//    }
//
//    private void animateIn() {
//        binding.points.setAlpha(0f);
//        binding.points.setScaleX(.1f);
//        binding.points.setScaleY(.1f);
//        binding.points.animate()
//                .alpha(1)
//                .scaleX(1)
//                .scaleY(1)
//                .setInterpolator(new OvershootInterpolator())
//                .setDuration(2000)
//                .start();
//    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        getActivity().getMenuInflater().inflate(R.menu.main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//                    switch (item.getItemId()) {
//                        case R.id.bookmark_menu:
//                            return true;
//                    }
        return false;
    }
}
