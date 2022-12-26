package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Forumankaramagaza extends AppCompatActivity {
    ListView listemizz;
    String[] magazalar = {"BAMBİ","DEICHMAN","DERIMOD","DIVARESSE","FLO","GREYDER","SKESCHERS","EBEBEK","VICCO","BEKO","BOSCH","MEDIA MARKT","PHILIPS","REEDER","SAMSUNG","SUEMENS","LG","TEFAL","TEKNOSA","VATAN","VESTEL","AVVA","CENGİZ INLER","CENTONE","DAMAT TWEEN","DUFY","HATEMOGLU","KİĞILI","SÜVARİ","TUDORS","COLİNS","DEFACTO","MAVİ","BEYMEN","KARACA","LC WAKIKI","NETWORK","US POLO","VAKKO","MADAME MOSS","ATASAY","ATASUN OPTİK","ARMAĞAN","TOYZZ SHOP","HUMMEL","INSTREET","LESCON","SPORJINAL"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forumankaramagaza);

        listemizz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,magazalar);
        listemizz.setAdapter(adapter);
    }
}