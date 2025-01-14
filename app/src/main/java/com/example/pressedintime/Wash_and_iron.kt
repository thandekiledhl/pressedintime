package com.example.pressedintime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Wash_and_iron : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wash_and_iron)

        val navBtn = findViewById<Button>(R.id.drycleanBtn3)
        navBtn.setOnClickListener(View.OnClickListener{

            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        })
        val navBtn2 = findViewById<Button>(R.id.washfoldBtn3)
        navBtn2.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Wash_and_fold::class.java)
            startActivity(intent)
        })
        val navBtn3 = findViewById<Button>(R.id.washironBtn3)
        navBtn3.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Wash_and_iron::class.java)
            startActivity(intent)
        })
        val navBtn4 = findViewById<Button>(R.id.ironBtn3)
        navBtn4.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Iron::class.java)
            startActivity(intent)
        })
    }
}

