package com.example.stuntrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.stuntrack.OnBoarding1
import kotlinx.coroutines.delay

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

<<<<<<< HEAD
        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, NextActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
=======
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen,OnBoarding1::class.java)
            startActivity(intent)
        },3000)
>>>>>>> b610ced17f0b1d5e7140b8e546742406e3841260
    }
}
