package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class ui_terverifikasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_terverifikasi)

        val btnClick1 = findViewById<MaterialButton>(R.id.button_selesai)

        btnClick1.setOnClickListener {
            Intent(this,signIn::class.java).also {
                startActivity(it)
                finish()
            }
        }

    }
}