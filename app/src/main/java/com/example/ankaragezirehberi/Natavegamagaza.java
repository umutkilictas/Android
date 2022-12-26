package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Natavegamagaza extends AppCompatActivity {
    ListView listemiz;
    String[] magazalar = {"DEFACTO","LC WAIKIKI","AYAKKABI DÜNYASI","BAMBI","DERIMODA","FLO","GREYDER","FLO","SKECHERS","TAMER TANCA","VICCO","AEK FIORE","AVVA","BEYMEN","KARACA","D'S DAMAT","HATEMOGLU","LUFIAN","SARAR","SUVARİ","TUDORS","CHIMA","IPEKYOL","EKOL","GLORIS","PENTI","TUĞBA","YARGICI","COLUMBIA","DAGİ","COLIN'S","LEVI'S","LTB","LOFT","MAVI","US POLO","GRATIS","FLORMAR","ROSSMAN","DAVID WALKER","YVES ROCHER","WATSONS","ADA","ARMAĞAN","ATASAY","ALTINÇİZGİ","ARC","ELEGANCE OPTİK","ŞAHİN SAAT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natavegamagaza);

        listemiz = (ListView) findViewById(R.id.listemizz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,magazalar);
        listemiz.setAdapter(adapter);
    }
}