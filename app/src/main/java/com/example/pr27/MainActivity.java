package com.example.pr27;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Taxi");
        new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, SignIn.class);
            startActivity(i);
            finish();
        }, 1000);
    }
}