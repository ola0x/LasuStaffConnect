package com.example.lasustaffconnect

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.annotation.RequiresApi

class ConstitutionAcrivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constitution_acrivity)

        var txt_policy = findViewById<TextView>(R.id.txt_policy)

        val str = resources.getString(R.string.abt_text_constitution_of_nigeria)
        txt_policy.text = Html.fromHtml(str, Html.FROM_HTML_MODE_COMPACT)
    }
}