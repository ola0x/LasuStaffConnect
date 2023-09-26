package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        var btn_new_activity = findViewById(R.id.button_get) as Button
        var btn_abt = findViewById(R.id.btn_about) as Button

        btn_new_activity.setOnClickListener {
            val intent = Intent(this@Welcome, AuthSignIn::class.java)
            startActivity(intent);
        }
        btn_abt.setOnClickListener {
            val intent = Intent(this@Welcome, AboutApp::class.java)
            startActivity(intent);
        }
    }
}