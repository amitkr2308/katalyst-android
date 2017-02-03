package com.example.deepti.sitetoappconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//TODO find view by ID


        WebSettings webSettings = myWebView.getSettings();

//TODO  Enable javascript using webSettings


//TODO  Load URL of your choice using myWebView


//TODO set WebViewClient so that all click actions are performed within app and not on browser


    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
