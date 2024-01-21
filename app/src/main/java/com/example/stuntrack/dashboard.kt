package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnClick1 = findViewById<CardView>(R.id.btnViewData)

        val btnClick2 = findViewById<CardView>(R.id.btnKirimQues)
        val btnClick3 = findViewById<CardView>(R.id.btnScanSekarang)

        btnClick1.setOnClickListener {
            Intent(this,pengaturan_data_anak::class.java).also {
                startActivity(it)
            }
        }


        btnClick2.setOnClickListener {
            Intent(this,faq::class.java).also {
                startActivity(it)
            }
        }

        btnClick3.setOnClickListener {
            Intent(this,scan_dataAnak::class.java).also {
                startActivity(it)
            }
        }


    }
}