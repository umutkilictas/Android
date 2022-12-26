package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Armadayemek extends AppCompatActivity {
    ListView listemizz;
    String[] yemekmagazalari = {"Bind Chocolate","Budakaltı","Burger King","Bursa İshakbey","Cafetat","Caribou Coffee","Coffee Crop","Dürümtat","Ege Günlüğü","Eliya Tea House","Espresso Lab","Fatboy","Günaydın Kasap&Steakhouse","HD İskender","Hmbrgr","Kafkas-Bolçi","Kahve Dünyası","KFC","Kitchenette","Lahmacun King","Macarons d’Antoinette","Mado","Malatya Pazarı","Mc Donald's","Mickey’s","Newcastle","Niyokki","Num Num","Otantik","Pideköy","Pidem","Pizza Il Forno","Quick China","Rollhouse Downtown Food Club","Sayrem","Sedil Kayseri Mutfağı","Şençam Köftecisi","Simitçi Dünyası","Starbucks","Subway","Tantuny","Tarihi Ankara Dönercisi","TGI Fridays","The Caffe İlly","Timboo Cafe","Welldone","Zeynel"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armadayemek);

        listemizz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,yemekmagazalari);
        listemizz.setAdapter(adapter);
    }
}