package com.teamone.e_tour.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentAccountRegistrationBinding;


public class AccountRegistrationFragment extends Fragment {
    private Context context;

    public AccountRegistrationFragment() {
    }

    private FragmentAccountRegistrationBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAccountRegistrationBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}