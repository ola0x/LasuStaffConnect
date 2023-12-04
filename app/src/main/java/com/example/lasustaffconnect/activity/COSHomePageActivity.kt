package com.example.lasustaffconnect.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lasustaffconnect.R

class COSHomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cos_scheme)

        var fp_cos_Senior = findViewById(R.id.fp_cos_Senior) as TextView
        var fp_cos_junior = findViewById(R.id.fp_cos_junior) as TextView

        var txt_abt_app = findViewById<TextView>(R.id.textView)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }

        fp_cos_Senior.setOnClickListener {
            val intent = Intent(this@COSHomePageActivity, COSActivity::class.java)
            startActivity(intent);
        }
        fp_cos_junior.setOnClickListener {
            val intent = Intent(this@COSHomePageActivity, SchemeActivity::class.java)
            startActivity(intent);
        }

    }
}