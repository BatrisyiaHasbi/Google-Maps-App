package com.example.googlemapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StudentDetail extends AppCompatActivity {
    TextView codelink;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);
        codelink = findViewById(R.id.textViewLink);
        codelink.setMovementMethod(LinkMovementMethod.getInstance());
        
        back = findViewById(R.id.backbutton);
        Clicklistener();
    }

    private void Clicklistener() {
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDetail.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}