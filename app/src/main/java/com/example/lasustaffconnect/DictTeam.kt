package com.example.lasustaffconnect

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DictTeam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dict_team)

        var dict_dir = findViewById<ImageView>(R.id.img_sir_david)
        var dict_male = findViewById<ImageView>(R.id.img_ogala)
        var dict_fem = findViewById<ImageView>(R.id.img_tolani)

        var txt_abt_app = findViewById<TextView>(R.id.txt_abt_app)
        txt_abt_app.setOnClickListener{
            onBackPressed()
        }

        dict_dir.setOnClickListener {
            val alert = ViewDialog()
            alert.showDialog(this@DictTeam, "Director, DICT")
        }
        dict_male.setOnClickListener {
            val alert = ViewDialog()
            alert.showDialog(this@DictTeam, "DICT Team (Male)")
        }
        dict_fem.setOnClickListener {
            val alert = ViewDialog()
            alert.showDialog(this@DictTeam, "DICT Team (Female)")
        }
    }
}