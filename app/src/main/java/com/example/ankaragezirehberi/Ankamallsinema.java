package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ankamallsinema extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankamallsinema);

        bagla();
        yukle();

        webView.setWebViewClient(new WebViewClient());
    }
    public void bagla(){
        webView = findViewById(R.id.web1);
    }
    public void yukle(){
        webView.loadUrl("https://www.sinemalar.com/sinemasalonu/1697/ankara-paribu-cineverse-ankamall");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}