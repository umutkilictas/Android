package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Armadamagaza extends AppCompatActivity {
    ListView listemizz;
    String[] magazalar = {"AÇELYA ÇİÇEKÇİLİK","ADA TERZİ","ADİDAS","ALMİLA","ALTINBAŞ","ARÇELİK","ARENA","ARMONIE PIRLANTA","ATASUN OPTİK","ATELIER MİNYON","AZ&ES BABY HOUSE","B&G STORE","BABY&JOY","BAQA","BATİK","BENETTON","BERNARDO","BEYMEN","BISSE","BJK KARTAL YUVASI","D%R","DAGI","DAMAT TWEEN","DEERY","DESA","DEXTER","DOCKER","DOLLS AND BOYS","DORE MUSIC","ELLE","ENGLISH HOME","ENZA HOME","ETSTUR","FAKİR","FENERIUM","FLORMAR","GRATIS","H%M","HARLEY DAVIDSON","HEMINGTON","IPEKYOL","JOLLY","JOURNEY","KARACA","KELEBEK","KİGILI","KORKMAZ","LACOSTE","LEVIS","MAC","LUFIAN","MADAME COCO","MANGO","MAVİ","MARKS&SPENCER","NIKE","PENTI","ROLEX/UGUR SAAT","SAMSUNG","SARAR","SEPHORA","SO CHIC","TEKNOSA","WATSONS","ZEN DIAMOND"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armadamagaza);

        listemizz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,magazalar);
        listemizz.setAdapter(adapter);
    }
}