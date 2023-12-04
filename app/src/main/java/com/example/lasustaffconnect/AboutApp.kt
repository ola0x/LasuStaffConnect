package com.example.lasustaffconnect

import android.annotation.SuppressLint
import android.graphics.text.LineBreaker
import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.annotation.RequiresApi

class AboutApp : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_app)

        var txt_welcome = findViewById(R.id.txt_welcome) as TextView

        var txt_abt_app = findViewById<TextView>(R.id.txt_abt_app)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }

        val str = resources.getString(R.string.vc_welcome_address)
        txt_welcome.text = Html.fromHtml(str, Html.FROM_HTML_MODE_COMPACT)


    }
}