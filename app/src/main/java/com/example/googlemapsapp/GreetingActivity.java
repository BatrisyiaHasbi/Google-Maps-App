package com.example.googlemapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {
    Button btnGPSShowLocation;
    Button btnShowAddress;
    TextView tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        btnGPSShowLocation = (Button) findViewById(R.id.btnGPSShowLocation);
        ClickListener();
    }

    private void ClickListener() {
        btnGPSShowLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent(GreetingActivity.this, MapsActivity.class);
                startActivity(mintent);
            }
        });
    }
}