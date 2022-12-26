package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ankamallyemek extends AppCompatActivity {
    ListView listemizz;
    String[] yemekmagazalari = {"AFYON LOKUM ATÖLYESİ","ALAÇATI MUHALLEBİCİSİ","ARBY'S","BAKLAVACI HACIBABA","BURGER KING","CAFFE NERO","CARMELO COFFEE","CHOCNETTE","DOYUYO","DÜRÜMLE","HACIOĞLU","HD DÖNER","HD İSKENDER",
            "HELLO SWEETIE","HMBRGR","İKBAL","KAHVE DÜNYASI","KAYSERİ MUTFAĞI","KEBO","KFC","MACARONS D’ANTONİETTE","MADO","MAKARNAM","MC DONALD'S","NESPRESSO","ÖZSÜT","PİDEKÖY",
            "PİDEM RESTAURANT","POLEN TANTUNİ","POPEYE'S","ROKO DONDURMA","ŞAN İSKENDER","SAYREM","SBARRO","SIR WINSTON PUB","STARBUCK'S","SÜPER KUMPİR","TAVUK DÜNYASI","TERRA PIZZA","WAFFLE STOP","ZEYNEL"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankamallyemek);

        listemizz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,yemekmagazalari);
        listemizz.setAdapter(adapter);
    }
}