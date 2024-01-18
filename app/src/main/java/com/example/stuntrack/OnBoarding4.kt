package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton

class OnBoarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding4)

        val buttonSave: MaterialButton = findViewById(R.id.button_save)

        buttonSave.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@OnBoarding4, OnBoarding5::class.java)
            startActivity(intent)
        })
    }
}