package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class pengaturan_data_anak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan_data_anak)

        val btnClick1 = findViewById<Button>(R.id.tambahdataAnak)

        btnClick1.setOnClickListener {
            Intent(this,dataAnak::class.java).also {
                startActivity(it)
            }
        }

    }
}