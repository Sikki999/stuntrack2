package com.example.stuntrack.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.stuntrack.R
import com.google.android.material.button.MaterialButton

class onBoarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

        val buttonSave: MaterialButton = findViewById(R.id.button_save)

        buttonSave.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@onBoarding1, onBoarding2::class.java)
            startActivity(intent)
        })
    }
}