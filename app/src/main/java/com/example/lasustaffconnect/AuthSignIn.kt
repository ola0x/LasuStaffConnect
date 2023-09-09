package com.example.lasustaffconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class AuthSignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_sign_in)

        var btn_new_activity = findViewById(R.id.button_signin) as Button

        var btn_next = findViewById(R.id.textView8) as TextView

        btn_new_activity.setOnClickListener {
//            val intent = Intent(this@AuthSignIn, MainActivity::class.java)
//            startActivity(intent);
            Toast.makeText(this@AuthSignIn, "Create an account first!", Toast.LENGTH_SHORT).show()
        }

        btn_next.setOnClickListener {
            val intent = Intent(this@AuthSignIn, AuthSignUp::class.java)
            startActivity(intent);
        }
    }
}