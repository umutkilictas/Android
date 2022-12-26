package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForumAnkara extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum_ankara);

        findViewById(R.id.button40).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ForumAnkara.this,Forumankarasinema.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button41).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(ForumAnkara.this,Forumankaramagaza.class);
                startActivity(intent1);
            }
        });
        findViewById(R.id.button42).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(ForumAnkara.this,Forumankarayemek.class);
                startActivity(intent2);
            }
        });
        findViewById(R.id.button43).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(ForumAnkara.this,Forumankaraozgu.class);
                startActivity(intent2);
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(ForumAnkara.this,Maps.class);
                startActivity(intent2);
            }
        });
    }
}