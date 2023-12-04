package com.example.lasustaffconnect.activity

import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.lasustaffconnect.R


class BulletinActivity : AppCompatActivity() {

    private lateinit  var webView: WebView
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
        this.webView = findViewById<WebView>(R.id.webview_c)

        val webSettings = webView.settings
        // onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        // this will enable the javascript.
        webSettings.javaScriptEnabled = true
//        val webViewClient = WebViewClientImpl(this)
//        webView.webViewClient = webViewClient

        // loading http://www.google.com url in the WebView.
        webView.loadUrl("https://lasuoer.online/publication.php")
        // WebViewClient allows you to handle

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && this.webView.canGoBack()) {
            this.webView.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}