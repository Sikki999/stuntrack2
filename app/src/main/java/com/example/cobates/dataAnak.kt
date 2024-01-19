package com.example.cobates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dataAnak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_anak)



      //Button Back
        val btnClick = findViewById<Button>(R.id.btnSimpan)

        btnClick.setOnClickListener {
            finish()
        }
    }
}