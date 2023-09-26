package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class AuthSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_sign_up)

        var btn_new_activity = findViewById(R.id.button_signin) as Button

        var btn_next = findViewById(R.id.textView10) as TextView
        var btn_next1 = findViewById(R.id.textView9) as TextView

        btn_new_activity.setOnClickListener {
            val intent = Intent(this@AuthSignUp, MainActivity::class.java)
            startActivity(intent);
            Toast.makeText(this@AuthSignUp, "Successfully Signed Up!", Toast.LENGTH_SHORT).show()
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