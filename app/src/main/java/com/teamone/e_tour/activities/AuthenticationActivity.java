package com.teamone.e_tour.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

import com.teamone.e_tour.databinding.ActivityAuthenticationBinding;

public class AuthenticationActivity extends AppCompatActivity {
    AuthenticationInfo viewmodel = new AuthenticationInfo();

    public class AuthenticationInfo extends BaseObservable {
        public AuthenticationInfo() {
        }

        public ObservableField<String> username = new ObservableField<>();
        public ObservableField<String> password = new ObservableField<>();

        public void signInWithGoogle() {
        }

        public void onSignUp() {
        }

        public void onSignIn() {
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAuthenticationBinding activityAuthenticationBinding = ActivityAuthenticationBinding.inflate(getLayoutInflater());
        activityAuthenticationBinding.setViewModel(viewmodel);
        setContentView(activityAuthenticationBinding.getRoot());
    }
}