package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class digerrandom extends AppCompatActivity {
    public static int random(){
        int a=(int )((Math.random())*3);
        return a;
    }
    ListView liste;
    TextView yazi;
    ImageView resim;

    String[] digeryerler={"Millet Bahçesi","Hamamönü","Teleferik"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digerrandom);
        yazi = (TextView) findViewById(R.id.yazi);
        liste = (ListView) findViewById(R.id.liste);
        resim =(ImageView) findViewById(R.id.resim);

        switch (random()){
            case 0: yazi.setText(digeryerler[0]+"'ni ziyaret edebilirsiniz!\nAKM Millet Bahçesi, millet kıraathanesi, yeşil alanları, yürüyüş, koşu, bisiklet parkurları, buz pisti, dinlenme ve piknik alanlarıyla doğayla iç içe bir sosyal yaşam alanı olarak vatandaşların ilgisini çekiyor.");
                resim.setImageResource(R.drawable.millet);
                break;
            case 1: yazi.setText(digeryerler[1]+"'nü ziyaret edebilirsiniz!\nCanlı müzik konserleri ve film gösterimleri gibi etkinliklere ev sahipliği yapan Hamamönü, Ankara’da yılın her döneminde ziyaret edebileceğiniz ve gezebileceğiniz bir yerdir. Sanat Sokağı’ndaki tarihi evlerde geleneksel el sanatlarıyla uğraşan sanatçıların eserlerini görebilir; el ürünleri pazarında ise yerel halkın el emeği üretimlerini satın alabilirsiniz.");
                resim.setImageResource(R.drawable.hamamonu);
                break;
            case 2: yazi.setText(digeryerler[2]+"'le Ankara manzarasının keyfini çıkarabilirsiniz!\nToplu taşıma amacıyla yapılan teleferik Ankara'yı yukarıdan izleme fırsatı sunuyor.Şentepe ile Yenimahalle arasında size hem ulaşım kolaylığı hem de güzel bir manzara izlemenizi sağlıyor.Güzel vakit geçirmenizi sağlayan teleferik hattı sağladığı hizmete kıyasla da gayet makul bir fiyatla karşımıza çıkıyor.");
                resim.setImageResource(R.drawable.teleferik);
                break;


        }
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(digerrandom.this,Maps2.class);
                startActivity(intent);
            }

        });
    }
}