package com.example.hotelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onLoginClick(View v)
    {
        Intent i = new Intent(this,Book.class);
        EditText txt = (EditText) findViewById(R.id.name);
        String msg = txt.getText().toString();

        i.putExtra("Msg",msg);

        startActivity(i);
    }
}
