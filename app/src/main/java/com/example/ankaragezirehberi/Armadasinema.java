package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Armadasinema extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armadasinema);

        bagla();
        yukle();

        webView.setWebViewClient(new WebViewClient());
    }
    public void bagla(){
        webView = findViewById(R.id.web1);
    }
    public void yukle(){
        webView.loadUrl("https://www.armadaavm.com.tr/cinema");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}