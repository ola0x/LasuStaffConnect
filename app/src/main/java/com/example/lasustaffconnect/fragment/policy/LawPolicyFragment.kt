package com.example.lasustaffconnect.fragment.policy


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.lasustaffconnect.R

class LawPolicyFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {

        val view = inflater.inflate(R.layout.fragment_webview, container, false)

//        val textView: TextView = view.findViewById(R.id.txt_policy)
//
//        val str = resources.getString(R.string.text_cos_senior_chapter_one)
//        textView.text = Html.fromHtml(str, Html.FROM_HTML_MODE_COMPACT)

//        val data = resources.getString(R.string.text_cos_senior_chapter_one)
//
//        val webview = view.findViewById(R.id.webview_c) as WebView
//        webview.settings.javaScriptEnabled = true
//        webview.loadDataWithBaseURL(null, data, "text/html", "UTF-8", null)

        return view
    }
}