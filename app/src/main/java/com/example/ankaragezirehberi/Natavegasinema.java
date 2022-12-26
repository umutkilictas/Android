package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Natavegasinema extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natavegasinema);

        bagla1();
        yukle1();

        webView.setWebViewClient(new WebViewClient());
    }
    public void bagla1(){
        webView = findViewById(R.id.web);
    }
    public void yukle1(){
        webView.loadUrl("https://biletinial.com/mekan/ankara-natavega-prestige");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}