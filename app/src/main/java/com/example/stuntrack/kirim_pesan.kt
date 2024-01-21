package com.example.stuntrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class kirim_pesan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirim_pesan)

        val toolbar = findViewById<Toolbar>(R.id.tbDetailMbl)
        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            title = "PESAN"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

}