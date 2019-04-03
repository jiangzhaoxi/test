package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Review extends AppCompatActivity {
     private Button button1;
     private Button button2;
     private Button button3;
     private Button button4;
     private Button button5;
     private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        button1 = findViewById(R.id.btn_writing);
        button2 = findViewById(R.id.btn_speaking);
        button3 = findViewById(R.id.btn_reading);
        button4 = findViewById(R.id.btn_translate);
        button5 = findViewById(R.id.btn_picture);
        button6 = findViewById(R.id.btn_listen);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),writing.class);
                startActivity(it);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),speaking.class);
                startActivity(it);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),reading.class);
                startActivity(it);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),translate.class);
                startActivity(it);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),picture.class);
                startActivity(it);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),listen.class);
                startActivity(it);
            }
        });
    }
}
