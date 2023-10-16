package com.example.lasustaffconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GoverningCouncilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_governing_council)

        var txt_abt_app = findViewById<TextView>(R.id.txt_abt_app)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }
    }
}