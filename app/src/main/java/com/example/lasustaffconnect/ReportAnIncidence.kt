package com.example.lasustaffconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReportAnIncidence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_contact)

        var txt_abt_app = findViewById(R.id.txt_abt_app) as TextView
        var txt_email = findViewById(R.id.txt_email) as TextView

        txt_abt_app.text = "Contact VC's Office"
//        txt_email.text = ""

        txt_abt_app.setOnClickListener{
            onBackPressed()
        }

    }
}