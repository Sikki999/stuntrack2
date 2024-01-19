package com.example.cobates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick1 = findViewById<CardView>(R.id.btnViewData)
        val btnClick2 = findViewById<CardView>(R.id.btnKirimQues)

        btnClick1.setOnClickListener {
            Intent(this,dataAnak::class.java).also {
                startActivity(it)
            }
        }
        btnClick2.setOnClickListener {
            Intent(this, faq::class.java).also {
                startActivity(it)
            }
        }

    }
}