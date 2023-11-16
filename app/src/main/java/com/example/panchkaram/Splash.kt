package com.example.panchkaram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class Splash : AppCompatActivity() {

    private val splashTimeOut: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



        Handler().postDelayed({
            val mainIntent = Intent(this, Splash1::class.java)
            startActivity(mainIntent)
            finish()
        }, splashTimeOut)
    }
}