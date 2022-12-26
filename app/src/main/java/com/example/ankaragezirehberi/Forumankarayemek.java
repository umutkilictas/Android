package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Forumankarayemek extends AppCompatActivity {
    ListView listemizz;
    String[] yemekmagazalari = {"Arby's","BayDöner","Burger King","Dönercix","Gönül Kahvesi","HD İskender","MADO","Makarnam","Ormancı","Otantik Kumpir","Pidem","Popeyes","Sbarro","Simitç Dünyası","Starbucks","Tavuk Sepeti","Usta Dönerci","Usta Pideci"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forumankarayemek);

        listemizz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,yemekmagazalari);
        listemizz.setAdapter(adapter);
    }
}