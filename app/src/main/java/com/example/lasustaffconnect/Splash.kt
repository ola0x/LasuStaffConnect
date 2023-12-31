package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        Handler().postDelayed({
            val mainIntent = Intent(this@Splash, Welcome::class.java)
            startActivity(mainIntent)
            finish()
        }, 2000)
    }
}