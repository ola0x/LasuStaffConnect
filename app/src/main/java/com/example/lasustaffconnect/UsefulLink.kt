package com.example.lasustaffconnect

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UsefulLink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_useful_links)

        var ul_exam_counter = findViewById(R.id.ul_exam_counter) as TextView
        var ul_exam_attendance = findViewById(R.id.ul_exam_attendance) as TextView
        var ul_academic_staff = findViewById(R.id.ul_academic_staff) as TextView
        var ul_non_academic_staff = findViewById(R.id.ul_non_academic_staff) as TextView
        var ul_data_request = findViewById(R.id.ul_data_request) as TextView

        ul_exam_counter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://studentservices.lasu.edu.ng/exam_courses_count/checker/"));
            startActivity(intent);
        }
        ul_exam_attendance.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://studentservices.lasu.edu.ng/exam_courses_count/admin/"));
            startActivity(intent);
        }
        ul_academic_staff.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://lasu.edu.ng/home/academic-staff/"));
            startActivity(intent);
        }
        ul_non_academic_staff.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://lasu.edu.ng/home/non-academic-staff/"));
            startActivity(intent);
        }
        ul_data_request.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://lasu.edu.ng/home/datarequest/"));
            startActivity(intent);
        }

        var txt_abt_app = findViewById<TextView>(R.id.txt_abt_app)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }

    }
}