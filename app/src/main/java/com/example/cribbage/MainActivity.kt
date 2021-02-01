package com.example.cribbage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var start_btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_btn = findViewById(R.id.start_btn)

        start_btn.setOnClickListener {
            // TODO: Launch game when pressed
        }
    }
}