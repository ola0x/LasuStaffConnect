package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_home)

        var btn_info = findViewById(R.id.frameinfo) as TextView
        var btn_new_law = findViewById(R.id.framelasu) as TextView
        var btn_fp = findViewById(R.id.framefp) as TextView
        var btn_framepg = findViewById(R.id.framepg) as TextView
        var btn_framecos = findViewById(R.id.framecos) as TextView
        var btn_framelasg = findViewById(R.id.framelasg) as TextView
        var btn_frameexam = findViewById(R.id.frameexam) as TextView

        btn_info.setOnClickListener {
            val intent = Intent(this@MainActivity, OtherActivity::class.java)
            startActivity(intent);
        }
        btn_new_law.setOnClickListener {
            val intent = Intent(this@MainActivity, LasuLaw::class.java)
            startActivity(intent);
        }
        btn_fp.setOnClickListener {
            val intent = Intent(this@MainActivity, FinancialActivity::class.java)
            startActivity(intent);
        }
        btn_framepg.setOnClickListener {
            val intent = Intent(this@MainActivity, PGActivity::class.java)
            startActivity(intent);
        }
        btn_framelasg.setOnClickListener {
            val intent = Intent(this@MainActivity, LASGActivity::class.java)
            startActivity(intent);
        }
        btn_framecos.setOnClickListener {
            val intent = Intent(this@MainActivity, COSActivity::class.java)
            startActivity(intent);
        }
        btn_frameexam.setOnClickListener {
            val intent = Intent(this@MainActivity, ExamPolicyActivity::class.java)
            startActivity(intent);
        }
    }
}