package com.example.stuntrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stuntrack.R
import com.google.android.material.button.MaterialButton
import android.view.View
import android.content.Intent


class OnBoarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)

        val buttonSave: MaterialButton = findViewById(R.id.button_save)

        buttonSave.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@OnBoarding2, OnBoarding3::class.java)
            startActivity(intent)
        })
    }
}