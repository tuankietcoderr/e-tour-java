package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentAddPaymentCardBinding;

public class AddPaymentCard extends Fragment {
    public AddPaymentCard() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentAddPaymentCardBinding binding = FragmentAddPaymentCardBinding.inflate(inflater);

        return binding.getRoot();
    }
}