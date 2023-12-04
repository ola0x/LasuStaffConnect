package com.example.lasustaffconnect.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lasustaffconnect.R

class Helpdesk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_contact)

        var txt_abt_app = findViewById(R.id.txt_abt_app) as TextView
        var txt_email = findViewById(R.id.txt_email) as TextView

        txt_abt_app.text = "Contact Director, DICT"
        txt_email.text = "staffsupport@lasu.edu.ng"

        txt_abt_app.setOnClickListener {
            onBackPressed()
        }

    }
}