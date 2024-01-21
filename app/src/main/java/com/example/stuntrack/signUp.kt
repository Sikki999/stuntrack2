package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.button.MaterialButton

class signUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnClick1 = findViewById<MaterialButton>(R.id.button_setuju)
        val imageView: ImageView = findViewById(R.id.img_google)

        btnClick1.setOnClickListener {
            Intent(this,signIn::class.java).also {
                startActivity(it)
            }
        }
        imageView.setOnClickListener {
            val intent = Intent(this, konfirmasi_email::class.java)
            startActivity(intent)
        }
    }
}