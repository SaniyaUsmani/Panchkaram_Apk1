package com.example.panchkaram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookingSuccessfulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_successful)

        val button: Button = findViewById(R.id.button9)

        val intent: Intent = Intent(this, Splash3::class.java)//Splash3 change into next intent which we want to show next
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}