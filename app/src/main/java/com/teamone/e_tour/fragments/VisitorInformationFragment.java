package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentVisitorInformationBinding;

public class VisitorInformationFragment extends Fragment {

    public VisitorInformationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentVisitorInformationBinding binding = FragmentVisitorInformationBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}