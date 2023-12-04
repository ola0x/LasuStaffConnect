package com.example.lasustaffconnect.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lasustaffconnect.R

class ManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_management)

        var txt_abt_app = findViewById<TextView>(R.id.txt_abt_app)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }
    }
}