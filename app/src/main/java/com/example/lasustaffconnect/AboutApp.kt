package com.example.lasustaffconnect

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

        var txt_welcome = findViewById(R.id.textView5) as TextView

        val str = resources.getString(R.string.welcome_message)

        txt_welcome.text = Html.fromHtml(str, Html.FROM_HTML_MODE_COMPACT)

        txt_welcome.movementMethod = LinkMovementMethod.getInstance()

    }
}