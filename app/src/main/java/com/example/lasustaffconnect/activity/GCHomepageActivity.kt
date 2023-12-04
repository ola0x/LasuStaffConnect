package com.example.lasustaffconnect.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lasustaffconnect.R

class GCHomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gchomepage)

        var fc_ms = findViewById<TextView>(R.id.fc_ms)
        var fc_gc = findViewById<TextView>(R.id.fc_gc)

        var txt_abt_app = findViewById<TextView>(R.id.textView)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }

        fc_ms.setOnClickListener {
            val intent = Intent(this@GCHomepageActivity, ManagementActivity::class.java)
            startActivity(intent);
        }

        fc_gc.setOnClickListener {
            val intent = Intent(this@GCHomepageActivity, GoverningCouncilActivity::class.java)
            startActivity(intent);
        }
    }
}