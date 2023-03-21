package com.teamone.e_tour.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.teamone.e_tour.databinding.ActivitySignUpWithGoogleBinding;

public class SignUpWithGoogle extends AppCompatActivity {
    String accessToken;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySignUpWithGoogleBinding binding = ActivitySignUpWithGoogleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        accessToken = getIntent().getExtras().getString("accessToken");
        email = getIntent().getExtras().getString("email");
    }
}