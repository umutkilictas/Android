package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class muzerandomu extends AppCompatActivity {
    public static int random(){
        int a=(int )((Math.random())*10);
        return a;
    }
    ListView liste;
    TextView yazi;
    ImageView resim;

    String[] muzeler={"Anıtkabir","Anadolu Medeniyetler Müzesi","Rahmi Koç Müzesi","Kurtuluş Savaşı Müzesi","Ulucanlar Cezaevi Müzesi","MTA Şehit Cuma Dağ Müzesi","Altınköy Açıkhava Müzesi","Cumhuriyet Müzesi","Erimtan Arkeoloji ve Sanat Müzesi","Etnografya Müzesi"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muzerandomu);
        yazi = (TextView) findViewById(R.id.yazi);
        liste = (ListView) findViewById(R.id.liste);
        resim =(ImageView) findViewById(R.id.resim);

        switch (random()){
            case 0: yazi.setText(muzeler[0]+"i ziyaret edebilirsiniz! \nAnıtkabir, Türk Kurtuluş Savaşı'nın ve inkılaplarının önderi ve Türkiye Cumhuriyeti'nin ilk Cumhurbaşkanı Mustafa Kemal Atatürk'ün, Ankara Anıttepe'de (eski adıyla Rasattepe) bulunan anıt mezarıdır. Ziyaret saatleri ise şu şekildedir:\n01 Şubat - 14 Mayıs Tarihleri Arasında Açılış: 09:00 - Kapanış: 16:30.\n" +
                    "15 Mayıs - 31 Ekim Tarihleri Arasında Açılış: 09:00 - Kapanış: 17:00.\n" +
                    "01 Kasım - 31 Ocak Tarihleri Arasında Açılış: 09:00 - Kapanış: 16:00.");
                resim.setImageResource(R.drawable.anitkabir);
                break;
            case 1: yazi.setText(muzeler[1] +"'ni ziyaret edebilirsiniz! \n1997’de “Avrupa’da Yılın Müzesi” seçilen ve kendine özgü koleksiyonları ile dünyanın sayılı müzeleri arasında yer alan Anadolu Medeniyetleri Müzesi’nde eserler, kronolojik olarak ayrılmış bölümlerde sergilenmektedir. Haftanın her günü 08:30–17:30 saatleri arasında ziyaret edebilirsiniz.");
                resim.setImageResource(R.drawable.medeniyetler);
                break;
            case 2: yazi.setText(muzeler[2] +"'ni ziyaret edebilirsiniz! \nAnkara’nın ilk sanayi müzesi olan Ankara Rahmi M. Koç Müzesi 2005 yılında ziyarete açılmıştır. Ankara Kalesi ana giriş kapısının hemen karşısında, eskiden At Pazarı olarak anılan mevkide yer alan müze iki ana binadan oluşmaktadır: Çengelhan ve Safranhan. Çalışma saatleri-Salı-Cuma: 10:00 - 17:00 Cumartesi-Pazar: 10:00 - 18:00 Pazartesi: Kapalı");
                resim.setImageResource(R.drawable.rahmikoc);
                break;
            case 3: yazi.setText(muzeler[3] +"'ni ziyaret edebilirsiniz! \nAnkara Ulus meydanında bulunan I. Türkiye Büyük Millet Meclisi binasının inşaasına, 1915 yılında başlanmıştır. İlkin İttihat ve Terakki Cemiyeti kulüp binası olarak tasarlanmıştır. Türk mimari stilinde olan iki katlı binanın en belirgin özelliği duvarlarında Ankara taşı (ANDEZİT) kullanılmış olmasıdır. Haftanın her günü 09:00-17:00 saatleri arasında ziyaret edebilirsiniz.");
                resim.setImageResource(R.drawable.kurtulusavasi);
                break;
            case 4: yazi.setText(muzeler[4] +"'ni ziyaret edebilirsiniz! \nUlucanlar Cezaevi, 1925 ve 2006 yılları arasında Ankara'nın Altındağ ilçesinde faaliyet göstermiş olan bir cezaevidir. Türk siyasi ve edebi hayatında da önemli bir yere sahip olan Ulucanlar Cezaevi'nin restore edilerek müze ve kültür sanat merkezine dönüştürülmesi projesi Altındağ Belediyesi'ne verildi. Restorasyon çalışmaları 2010 yılında tamamlandı. Pazartesi günleri ziyarete kapalı olan müzeyi haftanın altı günü 10:00-16:00 saatleri arasında ziyaret edebilirsiniz.");
                resim.setImageResource(R.drawable.ulucanlar);
                break;
            case 5: yazi.setText(muzeler[5] +"'ni ziyaret edebilirsiniz! \nTürkiye’nin ilk ve en büyük tabiat tarihi müzesidir. Maden Tetkik ve Arama Genel Müdürlüğü bünyesinde 7 Şubat 1968 tarihinde, kurumun arazi çalışmalarında toplanan örneklerin sergilenmesi ve depolanması amacıyla kurulmuştur. Müze, yerleşke içinde yapılan yeni binasında hizmet vermeye devam etmektedir. Pazartesi kapalı olan müzeyi haftanın altı günü 09:00–16:30 saatleri arasında ziyaret edebilirsiniz.");
                resim.setImageResource(R.drawable.mtacumadag);
                break;
            case 6: yazi.setText(muzeler[6] +"'ni ziyaret edebilirsiniz! \nBir Anadolu köyünde görebileceğiniz tüm yapılar ve daha fazlasını burada görebilir ve hissedebilirsiniz. Hissedebilirsiniz diyorum çünkü bir ekmek fırınında ekmek pişirilirken kokusunu alabilir, Su değirmeninde öğütülen mısırın kokusunun farkına varabilirsiniz. Köy hayvanlarınında bulunduğu bölgede tarla ve çeşitli ağaçlarıda görebilmek mümkün. Pazartesi günleri kapalı olan müzeyi haftanın altı günü 10:00-21:00 saatleri arasında ziyaret edebilirsiniz.");
                resim.setImageResource(R.drawable.altinkoy);
                break;
            case 7: yazi.setText(muzeler[7] +"'ni ziyaret edebilirsiniz! \nTürkiye Cumhuriyeti’nin kuruluşunda 2. Türkiye Büyük Millet Meclisi binası olarak hizmet veren müze; Atatürk ilke ve devrimlerinin doğuşuna ve çok partili sisteme tanıklık edişiyle cumhuriyet gençliğine adandı. 18 Ekim 1924’ten itibaren de meclis binası olarak hizmet vermeye başladı. Müzeyi haftanın her günü 09:00-17:00 saatleri arasında ziyaret edebilirsiniz.");
                resim.setImageResource(R.drawable.tbmm);
                break;
            case 8: yazi.setText(muzeler[8] +"'ni ziyaret edebilirsiniz! \nErimtan Arkeoloji ve Sanat Müzesi koleksiyonu, çoğu Anadolu kökenli, yaklaşık iki bin taşınır eserden oluşan özel bir arkeoloji koleksiyonudur. Koleksiyon, Yüksel Erimtan’ın 1960 yılında Roma yüzük taşları almasıyla başlamış, sonraları yetkin arkeologların tavsiyelerinden faydalanılarak genişletilmiştir. Ziyaret saatleri:\nPazartesi hariç hafta içi\n" +
                    "10.00-17.00\n" +
                    "Hafta sonu\n" +
                    "10.00-18.00");
                resim.setImageResource(R.drawable.erimtan);
                break;
            case 9: yazi.setText(muzeler[9] +"'ni ziyaret edebilirsiniz! \nTürkiye’de müze binası olarak yapılan ilk yapıdır. Müzenin önünde bulunan bronzdan yapılmış at üzerinde Atatürk heykeli 1927 yılında İtalyan heykeltıraş Pietro Canonica tarafından yapılmıştır. Halktan toplanan eserlerle 18 Temmuz 1930 tarihinde halkın ziyaretine açılmıştır. 1938 yılında Atatürk’ün vefatından sonra, müzenin iç avlusu 15 yıl süreyle Türkiye Cumhuriyeti'nin kurucusunun geçici istirahatgahı olmuştur. Ziyaret saatleri: Yaz Dönemi: 08:30-18:45\n" +
                    "Kış Dönemi: 08:30-16:45");
                resim.setImageResource(R.drawable.etnografya);
                break;
        }
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(muzerandomu.this,Maps3.class);
                startActivity(intent);
            }

        });
    }
}