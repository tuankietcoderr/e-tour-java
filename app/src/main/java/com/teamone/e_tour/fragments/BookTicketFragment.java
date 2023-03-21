package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentBookTicketBinding;

public class BookTicketFragment extends Fragment {

    static FragmentBookTicketBinding binding;

    public BookTicketFragment() {
        // Required empty public constructor
    }

    public static FragmentBookTicketBinding getBinding() {
        return binding;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBookTicketBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}