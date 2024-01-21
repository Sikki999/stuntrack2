package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.google.android.material.button.MaterialButton

class OnBoarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

        val btnClick1 = findViewById<MaterialButton>(R.id.button_save1)

        btnClick1.setOnClickListener {
            Intent(this,OnBoarding2::class.java).also {
                startActivity(it)
            }
        }


    }
}