package com.harsh.sharma.playstation.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.setWebViewClient(WebViewClient())
        myWebView.settings.javaScriptEnabled = true;
        myWebView.settings.allowFileAccessFromFileURLs = true;
        myWebView.settings.allowUniversalAccessFromFileURLs = true;

//        Load from Local Assets
        myWebView.loadUrl("file:///android_asset/index.html")

//        Load from web
//        myWebView.loadUrl("https://harsh159357.github.io/app_demos/index.html")
    }

}