package com.example.mylokki

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView = findViewById<LottieAnimationView>(R.id.lottieAnimationView)
        // You can control the animation programmatically, e.g., start, stop, pause, etc.
        animationView.playAnimation()
    }
}
