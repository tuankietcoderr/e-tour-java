package com.teamone.e_tour.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.transition.ChangeBounds;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.teamone.e_tour.R;
import com.teamone.e_tour.activities.AuthenticationActivity;
import com.teamone.e_tour.activities.HomeActivity;
import com.teamone.e_tour.activities.SignUpWithGoogle;
import com.teamone.e_tour.api.account.registration.SignUpWithGoogleAPI;
import com.teamone.e_tour.databinding.FragmentInputInformationSignUpWithGoogleBinding;
import com.teamone.e_tour.models.CredentialToken;
import com.teamone.e_tour.utils.SocketManager;

import java.io.IOException;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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