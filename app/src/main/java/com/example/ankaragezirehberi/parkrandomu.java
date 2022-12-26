package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class parkrandomu extends AppCompatActivity {
    public static int random(){
        int a=(int )((Math.random())*13);
        return a;
    }
    ListView liste;
    TextView yazi;
    ImageView resim;

    String[] parklar={"Eymir Gölü","Gençlik Parkı","Dikmen Vadisi" ,"Göksu Parkı" ,"Anfa Altınpark","Seğmenler Parkı","Mogan Gölü"," Ahlatlıbel Tesisleri Parkı","Kuğulu Park","50.yıl Parkı"," Atatürk Orman Çiftliği", "Harikalar Diyarı ","Kurtuluş Parkı"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkrandomu);
        yazi = (TextView) findViewById(R.id.yazi);
        liste = (ListView) findViewById(R.id.liste);
        resim =(ImageView) findViewById(R.id.resim);

        switch (random()){
            case 0: yazi.setText(parklar[0]+"'nü ziyaret edebilirsiniz!\nPiknik bisiklet sürmek gibi birçok aktivite yapabileceğiniz Eymir gölü kenarında isterseniz cafe ve restoranlarda oturupta vakit geçirebilirsiniz");
                resim.setImageResource(R.drawable.eymir);
                break;
            case 1: yazi.setText(parklar[1]+"'nı ziyaret edebilirsiniz!\n275 bin metrekare alan üzerine kurulan park, 2008-2009 yıllarında revize edilmiş olup 44 bin 296 metrekare havuz alanı ve 70 bin 422 metrekare çim alan yer almaktadır. 1.029 metrekare çocuk oyun alanı, 25 bin metrekare lunapark, 10 bin metrekare opera binası ile 8 bin metrekare, 638 kişilik Ankara'nın en büyük tiyatro salonlarından Ankara Büyükşehir Belediye Tiyatrosu bulunmaktadır");
                resim.setImageResource(R.drawable.genclikpark);
                break;
            case 2: yazi.setText(parklar[2]+"'ni ziyaret edebilirsiniz!\nÇocuklar için bir eğlence parkı, sporcular için kondisyon alanı ve koşu yolu, 9 adet kafe ve restoranı,34 bin m2lik havuz alanı ve çim alanları ile Ankara’nın orta yerinde yer alan bu dinlence mekanı; güvenliği, temizliği ve her ihtiyaca cevap veren donanımlarıyla  ailelerin, çocukların, gençlerin saatlerce hiç sıkılmadan vakit geçirebileceği bir yerdir.");
                resim.setImageResource(R.drawable.dikmenvadisi);
                break;
            case 3: yazi.setText(parklar[3]+"'nı ziyaret edebilirsiniz!\nYelken Kaskatlı Ada Restoran, Tepe Restoran, cay bahçeleri, sinema salonunun bulunduğu 13.000 m2 lik piknik alanı yer alır. Türkiye’de ilk kez uygulanan eğlence ve adrenalin bir arada yaşandığı Dağ Kızağı da parkın etkinlikleri arasında yer alır. İskele boyunca uzanan 1,6 km lik yürüme yolu,kuşbakışı seyir imkanı sağlayan deniz feneri ve daha birçok etkinlikleriyle Ankara’nın görülmeye ve gezilmeye değer gözde mekanları arasındadır.");
                resim.setImageResource(R.drawable.goksu);
                break;
            case 4: yazi.setText(parklar[4]+"'ı ziyaret edebilirsiniz!\nBilim Merkezi, uluslararası standartlarda fuar ve kongre merkezi, anaokulu ve yaz okulu, büfe ve lokantaları,müzikli ve ışıklı su gösterileri, oyun ve eğlence alanları, göl kıyısındaki amfileri, paten alanı, kayıkları, çarpışan botları,elektrikli gezinti arabaları, mini gezinti treni, atları, otoparkları ile Altınpark'ta hayatın bütün renklerini bulmak mümkündür.");
                resim.setImageResource(R.drawable.altinpark);
                break;
            case 5: yazi.setText(parklar[5]+"'nı ziyaret edebilirsiniz!\nSeğmenler Parkı, 46 bin 379 m2lik çim alanda, göleti, serası, spor alanları ve bitki örtüsü ile Başkentlilerin doğa ile baş başa kalabildiği bir yaşam alanıdır. Şirin kulübeleri, masa ve bankları ile hem gençlerin hem de ailelerin uğrak yeridir");
                resim.setImageResource(R.drawable.segmenlerparki);
                break;
            case 6: yazi.setText(parklar[6]+"'nü ziyaret edebilirsiniz!\nAhşap kıyı yolu, koşu ve yürüyüş yolları ile Ankara’nın bir başka sahil kasabası görünümündeki parklarından biri olan Mogan’da; piknik alanları, asma köprülerle ulaşımın sağlandığı sevgi adası, çocuklar için oyun ve park alanları, engelli miniklerin gönlünce vakit  geçirebileceği özel tasarlanmış oyun bölümleri, istasyonlu koşu pisti, 3 adet tenis kortu, 2 adet mini futbol sahası ve basketbol sahaları vardır.");
                resim.setImageResource(R.drawable.mogan);
                break;
            case 7: yazi.setText(parklar[7]+"'nı ziyaret edebilirsiniz!\nÇimlerine özgürce basılan yemyeşil bir dünya,n25.300 m² çim alan,n180.000 m² orman alan,1.500 araçlık otopark alanı,Çocuklar için güvenli oyun alanları,3 tenis kortu, 2 halı saha, 3 basketbol sahası, 2 voleybol sahası,Koşu ve yürüyüş parkurları,Golf sahası,Uçurtma imkânı Evcil hayvanları gezdirme alanı,Bisiklet yolu,Piknik alanı,Kafeteryalar,Bir çok kondisyon aletinin bulunduğu açık hava spor bahçesi");
                resim.setImageResource(R.drawable.ahlatlibel);
                break;
            case 8: yazi.setText(parklar[8]+"'ı ziyaret edebilirsiniz!\nKavaklıdere semtinde yer alan bu park kuğuları ile ünlüdür. Havuzda kuğular ve ördekler parkın içinde gezinirler. Ankara merkezde yer alan bu park, muhteşem tabiatı ve ev sahipliği yaptığı kuğuları ile şehir dışından gelenlerin mutlaka görmek istedikleri bir durak olmanın haricinde Ankarılaların da stres attıklar, şehir içinde orman havası soluduklarıbir noktadır. Ankara'nın sembollerinden olan Kuğulu Park, özellikle kış aylarında kar yağışı ile doyumsuz manzalar, muhteşem görüntüler vermektedir.");
                resim.setImageResource(R.drawable.kugulu);
                break;
            case 9: yazi.setText(parklar[9]+"'nı ziyaret edebilirsiniz!\nYaklaşık 130 bin metrekarelik alanı kaplayan parkta 3 bin 500 metrekarelik ve bin 300 metrekarelik iki ayrı gölet, derelerle birbirine  bağlanırken irili ufaklı pek çok süs balığına da ev sahipliği yapıyor.Parkta çeşmeler, bin 100 metrekarelik 4 çocuk oyunu alanı ile 1 adet de buz pateni pisti bulunuyor. Büyük ilgi gören yerlerden biri de çocuklar için tasarlanmış yaklaşık 10 bin 500 metrekarelik mini lunapark.Dönme dolap, çarpışan arabalar, salıncak her zaman çocukların gözdesi oluyor.");
                resim.setImageResource(R.drawable.yill);
                break;
            case 10: yazi.setText(parklar[10]+"'ni ziyaret edebilirsiniz!\n6 dönümlük alanın rehabilite edilmesiyle kurulan parkımızda, çocuk oyun alanları, oturma alanları, dişbudak, akçaağaç, meşe, karaçam,sedir gibi ağaçlar yer alıyor. Parkta, 500 adet gülün bulunduğu gül bahçesi, havuz, mevsim çiçeklerinden yapılan peyzajlar da bulunuyor.");
                resim.setImageResource(R.drawable.ataturkorman);
                break;
            case 11: yazi.setText(parklar[11]+"'nı ziyaret edebilirsiniz!\nAçık otoparkları, parkın konseptine uygun tasarlanmış yapıları, go-kart, kaykay pisti, model gemi yüzdürme alanı, model araba pisti, halı sahalar, basket sahaları, tenis kortları ile ziyaretçilerini ağırlayan Harikalar Diyarı,Ankara’nın huzur ve eğlenceyi bir arada sunan konsept mekanlarının başında gelmektedir.");
                resim.setImageResource(R.drawable.harikalardiyari);
                break;
            case 12: yazi.setText(parklar[12]+"'nı ziyaret edebilirsiniz!\nAnkara’nın eski parklarından biri olan Kurtuluş Parkı 2000 yılında revize edilmiştir.86.200 m2 toplam alana sahip parkta 49.000 m2 çim alan ile 2.000 m2 havuz alanı bulunmaktadır.10.000 m2 sini piknik alanının oluşturduğu parkta 3.000 m2 çocuk oyun alanı ile 200 m2 spor alanı yer almaktadır.");
                resim.setImageResource(R.drawable.kurtulus);
                break;

        }
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(parkrandomu.this,Maps4.class);
                startActivity(intent);
            }

        });

    }
}