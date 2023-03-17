package com.example.hotelapp;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void onSignup(View v)
    {
        Intent i = new Intent(this,Login.class);
        Toast.makeText(Signup.this,"Signup Successfull",Toast.LENGTH_LONG).show();
        startActivity(i);
    }
    public void onLogin(View v)
    {
        Intent i = new Intent(this,Login.class);

        startActivity(i);
    }
}
