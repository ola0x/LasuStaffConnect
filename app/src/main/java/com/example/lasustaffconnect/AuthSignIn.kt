package com.example.lasustaffconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Boolean


class AuthSignIn : AppCompatActivity() {
    var prevStarted = "yes"

    override fun onResume() {
        super.onResume()
        val sharedpreferences = getSharedPreferences("AuthSignIn", MODE_PRIVATE)
        if (!sharedpreferences.getBoolean(prevStarted, false)) {
            val editor = sharedpreferences.edit()
            editor.putBoolean(prevStarted, Boolean.TRUE)
            editor.apply()
        } else {
            moveToSecondary()
        }
    }

    fun moveToSecondary() {
        // use an intent to travel from one activity to another.
        val intent = Intent(this@AuthSignIn, MainActivity::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_sign_in)

        var btn_new_activity = findViewById(R.id.button_signin) as Button

        var btn_next = findViewById(R.id.textView8) as TextView
        var btn_next1 = findViewById(R.id.textView7) as TextView
        val edt_username = findViewById<EditText>(R.id.textView4)
        val edt_password= findViewById<EditText>(R.id.textView6)


        btn_new_activity.setOnClickListener {
            val username = edt_username.text.toString()
            val password = edt_password.text.toString()

            if (username.isBlank() || password.isBlank()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@AuthSignIn, "Create an account first!", Toast.LENGTH_SHORT).show()
            }
        }

        btn_next.setOnClickListener {
            val intent = Intent(this@AuthSignIn, AuthSignUp::class.java)
            startActivity(intent);
        }
        btn_next1.setOnClickListener {
            val intent = Intent(this@AuthSignIn, AuthSignUp::class.java)
            startActivity(intent);
        }
    }
}