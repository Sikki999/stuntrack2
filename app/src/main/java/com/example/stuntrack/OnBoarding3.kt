package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class OnBoarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding3)

        val btnClick1 = findViewById<MaterialButton>(R.id.button_save3)

        btnClick1.setOnClickListener {
            Intent(this,OnBoarding4::class.java).also {
                startActivity(it)
            }
        }
    }
}