package com.example.ankaragezirehberi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UygulamaSecsin extends AppCompatActivity {
    public static int random(){
        int a=(int)((Math.random())*4);
        return a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uygulama_secsin);
        switch (random()){
            default:
                Intent intent4=new Intent(UygulamaSecsin.this,MainActivity.class);
                startActivity(intent4);
                break;
            case 0:
                Intent intent=new Intent(UygulamaSecsin.this,avmrandomu.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1=new Intent(UygulamaSecsin.this,parkrandomu.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2=new Intent(UygulamaSecsin.this,muzerandomu.class);
                startActivity(intent2);

                break;
            case 3:
                Intent intent3=new Intent(UygulamaSecsin.this,digerrandom.class);
                startActivity(intent3);
                break;
        }

    }
}