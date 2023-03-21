package com.teamone.e_tour.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.teamone.e_tour.databinding.ActivityRegistrationActivitiesBinding;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityRegistrationActivitiesBinding binding = ActivityRegistrationActivitiesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}