package com.example.stuntrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.content.Intent
import android.os.Bundle

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, NextActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}
