package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        val buttonClose = findViewById<Button>(R.id.button_close)
        buttonClose.setOnClickListener {
            // Chama o método finish() para fechar a atividade atual
            finish()
        }
    }
}
