package com.binkhack.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.binkhack.R;
import com.binkhack.databinding.FragmentProfileBinding;
import com.binkhack.databinding.FragmentWalletBinding;


public class WalletFragment extends Fragment {

    private FragmentWalletBinding binding;

    public WalletFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wallet, container, false);
        binding = FragmentWalletBinding.bind(view);
        getActivity().setTitle("Wallet");

        return view;
    }
}
