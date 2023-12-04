package com.example.lasustaffconnect.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.lasustaffconnect.R

class BulletinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_webview)

//        val webview = findViewById(R.id.webview_c) as WebView
//
//        webview.loadUrl("http://35.153.50.50:8050/")
//
//        webview.settings.javaScriptEnabled = true
//        webview.getSettings().setBuiltInZoomControls(true);
//        webview.getSettings().setDisplayZoomControls(false);

        // Find the WebView by its unique ID
        val webView = findViewById<WebView>(R.id.webview_c)

        // loading http://www.google.com url in the WebView.
        webView.loadUrl("http://35.153.50.50:8050/home/")

        // this will enable the javascript.
        webView.settings.javaScriptEnabled = true

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

    }
}