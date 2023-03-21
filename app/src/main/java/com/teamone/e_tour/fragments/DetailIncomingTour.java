package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentDetailIncomingTourBinding;

public class DetailIncomingTour extends Fragment {
    public DetailIncomingTour() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentDetailIncomingTourBinding binding = FragmentDetailIncomingTourBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}