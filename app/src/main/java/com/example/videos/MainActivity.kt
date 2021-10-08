package com.example.videos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button1=findViewById(R.id.button1)
        Button1.setOnClickListener {
            val intent = Intent(this, video2::class.java)
            startActivity(intent)
        }
    }
}