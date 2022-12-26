package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Armadaozgu extends AppCompatActivity {
    ListView listemizz;
    String[] ozgu = {"Bowling","Korku Labirenti","Eğlence Oyun Merkezi","İF Armada Açık Hava Konserleri"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armadaozgu);

        listemizz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,ozgu);
        listemizz.setAdapter(adapter);
    }
}