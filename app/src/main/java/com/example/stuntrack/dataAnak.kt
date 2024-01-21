package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class dataAnak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_anak)

        val btnClick1 = findViewById<Button>(R.id.tambahdataAnak2)

        val toolbar = findViewById<Toolbar>(R.id.tbDetailMbl)
        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            title = "Data Anak"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        btnClick1.setOnClickListener {
            Intent(this,add_data_anak::class.java).also {
                startActivity(it)
            }
        }
    }
}