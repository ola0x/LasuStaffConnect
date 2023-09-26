package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

class ExamPolicyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_policy)

        var txt_title = findViewById(R.id.txt_title) as TextView
        var txt_overview = findViewById(R.id.txt_overview) as TextView
        var txt_view_policy = findViewById(R.id.txt_view_policy) as TextView
        var txt_abt_policy = findViewById(R.id.txt_abt_policy) as TextView
        var txt_policy = findViewById(R.id.txt_policy) as TextView


        txt_title.text = "Exam Policy & Guildlines"

        txt_view_policy.text = "View Regulation"
        txt_view_policy.setOnClickListener {
            txt_abt_policy.visibility = View.GONE
            txt_policy.text = "The Flexible Work Arrangements policy aims to support a diverse and inclusive workplace by providing employees with opportunities to achieve a healthy work-life balance. This policy outlines the guidelines and procedures for requesting and implementing flexible work arrangements, such as telecommuting, flexible hours, or job sharing, while ensuring that the organization's operational needs and productivity goals are met. It is our commitment to fostering a work environment that values employee well-being and recognizes the importance of accommodating"

        }

        txt_overview.setOnClickListener {
            txt_abt_policy.visibility = View.VISIBLE
            txt_policy.text = "The Flexible Work Arrangements policy aims to support a diverse and inclusive workplace by providing employees with opportunities to achieve a healthy work-life balance. This policy outlines the guidelines and procedures for requesting and implementing flexible work arrangements, such as telecommuting, flexible hours, or job sharing, while ensuring that the organization's operational needs and productivity goals are met. It is our commitment to fostering a work environment that values employee well-being and recognizes the importance of accommodating"

        }

        txt_abt_policy.text = "About this Policy"
        txt_policy.text = "The Flexible Work Arrangements policy aims to support a diverse and inclusive workplace by providing employees with opportunities to achieve a healthy work-life balance. This policy outlines the guidelines and procedures for requesting and implementing flexible work arrangements, such as telecommuting, flexible hours, or job sharing, while ensuring that the organization's operational needs and productivity goals are met. It is our commitment to fostering a work environment that values employee well-being and recognizes the importance of accommodating"

    }


}