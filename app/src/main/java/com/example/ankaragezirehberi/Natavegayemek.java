package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Natavegayemek extends AppCompatActivity {
    ListView listemiz;
    String[] yemekmagazalari = {"Arby's","Baydöner","Burger King","HD İskender","Mc Donald's","Pidem","Popeyes","Sbarro","Tavuk Dünyası"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natavegayemek);

        listemiz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,yemekmagazalari);
        listemiz.setAdapter(adapter);
    }
}