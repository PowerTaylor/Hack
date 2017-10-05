package com.binkhack.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.binkhack.R;
import com.binkhack.databinding.FragmentEventsBinding;
import com.binkhack.databinding.FragmentProfileBinding;


public class EventsFragment extends Fragment {

    private FragmentEventsBinding binding;

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        binding = FragmentEventsBinding.bind(view);
        getActivity().setTitle("Events");

        return view;
    }
}
