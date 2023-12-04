package com.example.lasustaffconnect.fragment.policy


import android.os.Build
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.lasustaffconnect.R


class FRPolicyFragment: Fragment() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_webview, container, false)

        val webview = view.findViewById(R.id.webview_c) as WebView
        webview.settings.javaScriptEnabled = true
        webview.getSettings().setBuiltInZoomControls(true);
        webview.getSettings().setDisplayZoomControls(false);
        webview.loadUrl("file:///android_asset/EXAM_POLICY.html")

        return view
    }


}