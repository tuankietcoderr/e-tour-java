package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentBasicInforRegistrationBinding;

public class BasicInforRegistrationFragment extends Fragment {
    private FragmentBasicInforRegistrationBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBasicInforRegistrationBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}