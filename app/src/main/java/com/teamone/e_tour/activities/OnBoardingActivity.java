package com.teamone.e_tour.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.teamone.e_tour.databinding.ActivityOnBoardingBinding;

public class OnBoardingActivity extends AppCompatActivity {
    ActivityOnBoardingBinding activityOnBoardingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityOnBoardingBinding = ActivityOnBoardingBinding.inflate(getLayoutInflater());
        setContentView(activityOnBoardingBinding.getRoot());


        activityOnBoardingBinding.getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onGetStartedClicked();
            }
        });
    }
    
    public void onGetStartedClicked() {
        startActivity(new Intent(this, AuthenticationActivity.class));
        finish();
    }
}