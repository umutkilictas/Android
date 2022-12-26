package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Natavega extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natavega);

        findViewById(R.id.button40).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Natavega.this,Natavegasinema.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button41).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(Natavega.this,Natavegamagaza.class);
                startActivity(intent1);
            }
        });
        findViewById(R.id.button42).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(Natavega.this,Natavegayemek.class);
                startActivity(intent2);
            }
        });
        findViewById(R.id.button43).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(Natavega.this,Natavegaozgu.class);
                startActivity(intent2);
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(Natavega.this,Maps.class);
                startActivity(intent2);
            }
        });
    }
}