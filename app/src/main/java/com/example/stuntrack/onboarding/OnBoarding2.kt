package com.example.stuntrack.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stuntrack.R
import com.google.android.material.button.MaterialButton
import android.view.View
import android.content.Intent

class onBoarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)

        val buttonSave: MaterialButton = findViewById(R.id.button_save)

        buttonSave.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@onBoarding2, OnBoarding3::class.java)
            startActivity(intent)
        })
    }
}