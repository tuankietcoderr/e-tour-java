package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentInputInformationSignUpWithGoogleBinding;

public class InputInformationSignUpWithGoogle extends Fragment {
    public InputInformationSignUpWithGoogle() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentInputInformationSignUpWithGoogleBinding binding = FragmentInputInformationSignUpWithGoogleBinding.inflate(inflater);

        return binding.getRoot();
    }
}