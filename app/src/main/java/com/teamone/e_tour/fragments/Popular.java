package com.teamone.e_tour.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.teamone.e_tour.R;
import com.teamone.e_tour.adapters.RouteListAdapter;
import com.teamone.e_tour.databinding.FragmentPopularBinding;
import com.teamone.e_tour.entities.TouristRoute;
import com.teamone.e_tour.models.PopularRouteManager;
import com.teamone.e_tour.models.RecommendedRouteManager;

import java.util.ArrayList;
import java.util.Objects;
public class Popular extends Fragment {

    public Popular() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentPopularBinding binding = FragmentPopularBinding.inflate(inflater, container, false);

        Window window = requireActivity().getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(requireActivity(), R.color.popular));

        binding.swiperefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                PopularRouteManager.getInstance(getActivity()).fetchData(10);
            }
        });

        RouteListAdapter adapter = new RouteListAdapter(Popular.this, R.layout.fragment_route_preview_card_small);
        binding.routeList.setAdapter(adapter);
        binding.routeList.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        binding.topAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Popular.this).popBackStack();
            }
        });

        PopularRouteManager.getInstance(getActivity()).getRouteList().observe(getViewLifecycleOwner(), new Observer<ArrayList<TouristRoute>>() {
            @Override
            public void onChanged(ArrayList<TouristRoute> touristRoutes) {
                if (touristRoutes.size() <= 0) return;
                binding.swiperefresh.setRefreshing(false);
                adapter.setRouteList(touristRoutes);
            }
        });

        return binding.getRoot();
    }
}