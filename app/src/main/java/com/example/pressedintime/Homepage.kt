package com.example.pressedintime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

    val navBtn = findViewById<Button>(R.id.drycleanBtn)
    navBtn.setOnClickListener(View.OnClickListener{

        val intent = Intent(this, Homepage::class.java)
        startActivity(intent)
    })
    val navBtn2 = findViewById<Button>(R.id.washfoldBtn)
    navBtn2.setOnClickListener(View.OnClickListener {

        val intent = Intent(this, Wash_and_fold::class.java)
        startActivity(intent)
    })
        val navBtn3 = findViewById<Button>(R.id.washironBtn)
        navBtn3.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Wash_and_iron::class.java)
            startActivity(intent)
        })
        val navBtn4 = findViewById<Button>(R.id.ironBtn)
        navBtn4.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Iron::class.java)
            startActivity(intent)
        })
}
}