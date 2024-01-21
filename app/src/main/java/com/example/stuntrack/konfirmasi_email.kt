package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class konfirmasi_email : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_email)

        val btnClick1 = findViewById<MaterialButton>(R.id.button_masuk)
        val btnClick2 = findViewById<MaterialButton>(R.id.button_masuk1)


        btnClick1.setOnClickListener {
            Intent(this,verifikasi_kode::class.java).also {
                startActivity(it)
            }
        }

        btnClick2.setOnClickListener {
            Intent(this,signIn::class.java).also {
                startActivity(it)
            }
        }
    }
}