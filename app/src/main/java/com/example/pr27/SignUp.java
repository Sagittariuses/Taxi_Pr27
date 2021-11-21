package com.example.pr27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button btnSignIn = findViewById(R.id.SignInBtn);
        btnSignIn.setOnClickListener(this::onClick);
        setTitle("Taxi");
    }
    public  void  onClick(View view ){
        Intent switcher = new Intent(this, StartScreen.class);
        startActivity(switcher);
    }
}