package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActWebViewLocal extends AppCompatActivity {
WebView juego;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_web_view_local);
        juego= (WebView)findViewById(R.id.juego);
        WebSettings webSettings = juego.getSettings();
        webSettings.setJavaScriptEnabled(true);
        juego.loadUrl("file:///android_asset/index.html");//vemos la pagina responsiv

        juego.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false; //matenerse en la pagina
            }
        });

    }
}