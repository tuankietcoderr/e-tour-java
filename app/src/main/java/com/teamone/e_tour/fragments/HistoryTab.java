package com.teamone.e_tour.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.teamone.e_tour.databinding.FragmentHistoryTabBinding;

public class HistoryTab extends Fragment {

    public HistoryTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        BookedTicketManager.getInstance((AppCompatActivity) getActivity()).viewBookedTickets();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentHistoryTabBinding binding = FragmentHistoryTabBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}