package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class OnBoarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding4)

        val textView: TextView = findViewById(R.id.txt_privacy)
        textView.movementMethod = LinkMovementMethod.getInstance()


        val btnClick1 = findViewById<MaterialButton>(R.id.button_save4)

        btnClick1.setOnClickListener {
            Intent(this,OnBoarding5::class.java).also {
                startActivity(it)
            }
        }

        //Button Back
        val btnClick = findViewById<Button>(R.id.button_tolak)

        btnClick.setOnClickListener {
            finish()
        }
    }
}