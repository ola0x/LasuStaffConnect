package com.example.lasustaffconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ICTReleasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_bulletin)

        var txt_faculty = findViewById<TextView>(R.id.txt_faculty)
        var txt_from = findViewById<TextView>(R.id.txt_from)
        var txt_to = findViewById<TextView>(R.id.txt_to)
        var txt_time_re = findViewById<TextView>(R.id.txt_time_re)

        txt_faculty.text = resources.getString(R.string.txt_ict)
        txt_from.text = resources.getString(R.string.txt_ict)

        txt_time_re.text = "Time remaining: 48hrs"



    }
}