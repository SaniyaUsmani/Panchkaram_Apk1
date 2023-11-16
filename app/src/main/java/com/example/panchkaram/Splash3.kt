package com.example.panchkaram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Splash3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash3)


        val button: Button = findViewById(R.id.button3)

        val intent: Intent = Intent(this, Login::class.java)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}