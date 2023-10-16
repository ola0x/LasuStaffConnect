package com.example.lasustaffconnect

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GCHomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g_c_homepage)

        var fc_ms = findViewById<TextView>(R.id.fc_ms)
        var fc_gc = findViewById<TextView>(R.id.fc_gc)

        var txt_abt_app = findViewById<TextView>(R.id.textView)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }

        fc_ms.setOnClickListener {
            val intent = Intent(this@GCHomepage, ManagementStaffActivity::class.java)
            startActivity(intent);
        }

        fc_gc.setOnClickListener {
            val intent = Intent(this@GCHomepage, GoverningCouncilActivity::class.java)
            startActivity(intent);
        }
    }
}