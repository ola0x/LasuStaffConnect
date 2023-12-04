package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Boolean

class AuthSignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_sign_up)

        var btn_new_activity = findViewById(R.id.button_signin) as Button

        var btn_next = findViewById(R.id.textView10) as TextView
        var btn_next1 = findViewById(R.id.textView9) as TextView
        val edt_email = findViewById<EditText>(R.id.textView4)
        val edt_username= findViewById<EditText>(R.id.textView6)
        val edt_password= findViewById<EditText>(R.id.textView8)

        btn_new_activity.setOnClickListener {
            val email = edt_email.text.toString()
            val username = edt_username.text.toString()
            val password = edt_password.text.toString()

            if (email.isBlank() || username.isBlank() || password.isBlank()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else if (!email.contains("@lasu.edu.ng")) {
                Toast.makeText(this, "Email must be a LASU email", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@AuthSignUp, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this@AuthSignUp, "Successfully Signed Up! using ${email}", Toast.LENGTH_SHORT).show()
            }

        }

        btn_next.setOnClickListener {
            val intent = Intent(this@AuthSignUp, AuthSignIn::class.java)
            startActivity(intent);
        }
        btn_next1.setOnClickListener {
            val intent = Intent(this@AuthSignUp, AuthSignIn::class.java)
            startActivity(intent);
        }
    }
}