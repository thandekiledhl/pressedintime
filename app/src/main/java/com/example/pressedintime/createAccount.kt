package com.example.pressedintime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class createAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val navBtn = findViewById<Button>(R.id.createAccBtn2)
        navBtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        })
        val navBtn2 = findViewById<Button>(R.id.loginBtn2)
        navBtn2.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
