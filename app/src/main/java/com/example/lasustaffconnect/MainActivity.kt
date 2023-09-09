package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_new_activity = findViewById(R.id.imageView) as ImageView

        btn_new_activity.setOnClickListener {
            val intent = Intent(this@MainActivity, LasuLaw::class.java)
            startActivity(intent);
        }
    }
}