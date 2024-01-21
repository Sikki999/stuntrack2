package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class signIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnClick1 = findViewById<MaterialButton>(R.id.button_masuk)
        val textView: TextView = findViewById(R.id.txt_lupaPassword)
        val textView2: TextView = findViewById(R.id.txt_daftar)
        val imageView: ImageView = findViewById(R.id.img_google)


        btnClick1.setOnClickListener {
            Intent(this,dashboard::class.java).also {
                startActivity(it)
            }
        }
        textView.setOnClickListener {
            // Tambahkan kode yang akan dijalankan saat TextView diklik
            val intent = Intent(this, lupa_password::class.java)
            startActivity(intent)
        }
        textView2.setOnClickListener {
            // Tambahkan kode yang akan dijalankan saat TextView diklik
            val intent = Intent(this, signUp::class.java)
            startActivity(intent)
        }
        imageView.setOnClickListener {
            val intent = Intent(this, konfirmasi_email::class.java)
            startActivity(intent)
        }

    }

}