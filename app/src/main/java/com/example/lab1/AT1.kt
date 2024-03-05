package com.example.lab1

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)

        val button_enter = findViewById<Button>(R.id.button_enter)
        button_enter.setOnClickListener {

            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }
}