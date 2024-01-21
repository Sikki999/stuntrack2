package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class lupa_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_password)

        val btnClick1 = findViewById<MaterialButton>(R.id.button_verifikasi)

        btnClick1.setOnClickListener {
            Intent(this,signIn::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}