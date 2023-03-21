package com.teamone.e_tour.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.teamone.e_tour.R;
import com.teamone.e_tour.api.paymentCard.PaymentCardApi;
import com.teamone.e_tour.databinding.FragmentPaymentCardDetailBinding;
import com.teamone.e_tour.dialogs.LoadingDialog;
import com.teamone.e_tour.entities.PaymentCard;
import com.teamone.e_tour.models.CredentialToken;
import com.teamone.e_tour.models.PaymentCardManager;
import com.teamone.e_tour.utils.Formatter;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PaymentCardDetail extends Fragment {
    public PaymentCardDetail() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentPaymentCardDetailBinding binding = FragmentPaymentCardDetailBinding.inflate(inflater);

        return binding.getRoot();
    }
}