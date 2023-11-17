package com.example.panchkaram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class CongratsActivity : AppCompatActivity() {

    private val congratsTimeOut: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)



        Handler().postDelayed({
            val mainIntent = Intent(this, HomeActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, congratsTimeOut)
    }
}