package com.example.pressedintime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navBtn = findViewById<Button>(R.id.loginBtn)
        navBtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        })
        val navBtn2 = findViewById<Button>(R.id.createBtn)
        navBtn2.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, createAccount::class.java)
            startActivity(intent)
        })
    }
}