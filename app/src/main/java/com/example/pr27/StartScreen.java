package com.example.pr27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        setTitle("Taxi");
    }
}