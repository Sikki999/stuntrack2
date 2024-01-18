package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton

class OnBoarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding3)

        val buttonSave: MaterialButton = findViewById(R.id.button_save)

        buttonSave.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@OnBoarding3, OnBoarding4::class.java)
            startActivity(intent)
        })
    }
}