package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentThanksForRatingBinding;

public class ThanksForRating extends Fragment {

    public ThanksForRating() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentThanksForRatingBinding binding = FragmentThanksForRatingBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}