package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class avmrandomu extends AppCompatActivity {
    public static int random(){
        int a=(int )((Math.random())*4);
        return a;
    }
    ListView liste;
    TextView yazi;
    ImageView resim;

    String[] avmler={"Natavega","Armada","Ankamall","Forum Ankara"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avmrandomu);
        yazi = (TextView) findViewById(R.id.yazi);
        liste = (ListView) findViewById(R.id.liste);
        resim =(ImageView) findViewById(R.id.resim);

        switch (random()){
            case 0: yazi.setText(avmler[0]+"yı ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>NATAVEGA' ya göz atabilirsiniz.");
                resim.setImageResource(R.drawable.natavega);
                break;
            case 1: yazi.setText(avmler[1]+"yı ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>ARMADA' ya göz atabilirsiniz.");
                resim.setImageResource(R.drawable.armada);
                break;
            case 2: yazi.setText(avmler[2]+"AVM' yi ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>ANKAMALL' a göz atabilirsiniz.");
                resim.setImageResource(R.drawable.ankamall);
                break;
            case 3: yazi.setText(avmler[3]+"yı ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>FORUM ANKARA' ya göz atabilirsiniz.");
                resim.setImageResource(R.drawable.forumankara);
                break;
        }
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(avmrandomu.this,Maps.class);
                startActivity(intent2);
            }
        });
    }
}