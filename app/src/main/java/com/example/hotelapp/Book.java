package com.example.hotelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Book extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Bundle data =getIntent().getExtras();
        String msg1 = data.getString("Msg");

        TextView txt = (TextView) findViewById(R.id.textView13);
        txt.setText(msg1);
    }
    public void onBook(View v)
    {
        Intent i = new Intent(this,Confirmation.class);
        Toast.makeText(Book.this,"Booking Confirmed",Toast.LENGTH_LONG).show();
        startActivity(i);
    }
}
