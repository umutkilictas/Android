package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ankamallmagaza extends AppCompatActivity {
    ListView listemizz;
    String[] magazalar = {"ABDULLAH KİĞILI","ADA TERZİ","ADDAX","ADIDAS","ADL","AKER","ALP GÜMÜŞ","ALTINBAŞ","ALTINÇİZGİ","ALTINYILDIZ CLASSİCS","AMASYA ET ÜRÜNLERİ","ANKAMALL ECZANE","ARÇELİK","ARMAĞAN GİYİM","ARMAĞAN GİYİM","ARMİNE","ASIAN","ATASAY","ATASUN OPTİK","AURA ACCESSORIES","AVVA"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankamallmagaza);

        listemizz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,magazalar);
        listemizz.setAdapter(adapter);
    }
}