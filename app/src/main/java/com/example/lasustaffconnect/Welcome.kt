package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.Boolean

class Welcome : AppCompatActivity() {

    var prevStarted = "yes"

//    override fun onResume() {
//        super.onResume()
//        val sharedpreferences = getSharedPreferences("Welcome", MODE_PRIVATE)
//        if (!sharedpreferences.getBoolean(prevStarted, false)) {
//            val editor = sharedpreferences.edit()
//            editor.putBoolean(prevStarted, Boolean.TRUE)
//            editor.apply()
//        } else {
//            moveToSecondary()
//        }
//    }
//
//    fun moveToSecondary() {
//        // use an intent to travel from one activity to another.
//        val intent = Intent(this@Welcome, MainActivity::class.java)
//        startActivity(intent)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        var btn_new_activity = findViewById(R.id.button_get) as Button
        var btn_abt = findViewById(R.id.btn_about) as Button

        btn_new_activity.setOnClickListener {
            val intent = Intent(this@Welcome, AuthSignIn::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent);
            this@Welcome.finish();
        }
        btn_abt.setOnClickListener {
            val intent = Intent(this@Welcome, AboutApp::class.java)
            startActivity(intent);
        }
    }
}