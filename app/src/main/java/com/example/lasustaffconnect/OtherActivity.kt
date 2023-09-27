package com.example.lasustaffconnect

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_info)

        var btn_lems = findViewById(R.id.frameview4) as TextView
        var btn_report = findViewById(R.id.frameview3) as TextView
        var btn_bulletin = findViewById(R.id.frameview1) as TextView

        btn_lems.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://leave.lasu.edu.ng/"));
            startActivity(intent);
        }

        btn_report.setOnClickListener {
            val intent = Intent(this@OtherActivity, ReportAnIncidence::class.java)
            startActivity(intent);
        }

        btn_bulletin.setOnClickListener {
            val intent = Intent(this@OtherActivity, BulletinActivity::class.java)
            startActivity(intent);
        }
    }
}