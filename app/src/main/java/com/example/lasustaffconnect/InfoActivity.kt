package com.example.lasustaffconnect

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_info)

        var fp_lems = findViewById(R.id.fp_lems) as TextView
        var fp_report = findViewById(R.id.fp_report) as TextView
        var fp_ispadems = findViewById(R.id.fp_ispadems) as TextView
        var fp_ecv = findViewById(R.id.fp_ecv) as TextView
        var fp_bulletin = findViewById(R.id.fp_bulletin) as TextView
        var fp_helpdesk = findViewById(R.id.fp_helpdesk) as TextView
        var fp_dict = findViewById(R.id.fp_dict) as TextView

        fp_lems.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://leave.lasu.edu.ng/"));
            startActivity(intent);
        }
        fp_ispadems.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://lasu.edu.ng/ispadems/"));
            startActivity(intent);
        }
        fp_ecv.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://web.lasu.edu.ng/ecv/"));
            startActivity(intent);
        }

        fp_report.setOnClickListener {
            val intent = Intent(this@InfoActivity, ReportAnIncidence::class.java)
            startActivity(intent);
        }

        fp_bulletin.setOnClickListener {
            val intent = Intent(this@InfoActivity, BulletinActivity::class.java)
            startActivity(intent);
        }
        fp_helpdesk.setOnClickListener {
            val intent = Intent(this@InfoActivity, Helpdesk::class.java)
            startActivity(intent);
        }
        fp_dict.setOnClickListener {
            val intent = Intent(this@InfoActivity, DictTeam::class.java)
            startActivity(intent);
        }
    }
}