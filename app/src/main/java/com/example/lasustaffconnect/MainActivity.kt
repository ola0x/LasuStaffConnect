package com.example.lasustaffconnect

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lasustaffconnect.activity.COSActivity
import com.example.lasustaffconnect.activity.COSHomePageActivity
import com.example.lasustaffconnect.activity.ConstitutionAcrivity
import com.example.lasustaffconnect.activity.ExamPolicyActivity
import com.example.lasustaffconnect.activity.FinancialActivity
import com.example.lasustaffconnect.activity.GCHomepageActivity
import com.example.lasustaffconnect.activity.GoverningCouncilActivity
import com.example.lasustaffconnect.activity.ICTReleasesActivity
import com.example.lasustaffconnect.activity.InfoActivity
import com.example.lasustaffconnect.activity.LASGActivity
import com.example.lasustaffconnect.activity.LasuLawActivity
import com.example.lasustaffconnect.activity.PActActivity
import com.example.lasustaffconnect.activity.PGActivity

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
        var btn_frameprocurement = findViewById(R.id.frameprocurement) as TextView
        var btn_framenigeria = findViewById(R.id.framenigeria) as TextView
        var btn_frameict = findViewById(R.id.frameict) as TextView
        var btn_framecouncil = findViewById(R.id.framecouncil) as TextView
        var btn_framefaculty = findViewById(R.id.framefaculty) as TextView

        btn_info.setOnClickListener {
            val intent = Intent(this@MainActivity, InfoActivity::class.java)
            startActivity(intent);
        }
        btn_new_law.setOnClickListener {
            val intent = Intent(this@MainActivity, LasuLawActivity::class.java)
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
            val intent = Intent(this@MainActivity, COSHomePageActivity::class.java)
            startActivity(intent);
        }
        btn_frameexam.setOnClickListener {
            val intent = Intent(this@MainActivity, ExamPolicyActivity::class.java)
            startActivity(intent);
        }
        btn_frameprocurement.setOnClickListener {
            val intent = Intent(this@MainActivity, PActActivity::class.java)
            startActivity(intent);
        }
        btn_framenigeria.setOnClickListener {
            val intent = Intent(this@MainActivity, ConstitutionAcrivity::class.java)
            startActivity(intent);
        }
        btn_frameict.setOnClickListener {
            val intent = Intent(this@MainActivity, ICTReleasesActivity::class.java)
            startActivity(intent);
        }
        btn_framecouncil.setOnClickListener {
            val intent = Intent(this@MainActivity, GCHomepageActivity::class.java)
            startActivity(intent);
        }
        btn_framefaculty.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://lasu.edu.ng/home/faculties/"));
            startActivity(intent);
        }
    }
}