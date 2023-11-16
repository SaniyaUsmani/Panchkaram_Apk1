package com.example.panchkaram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Splash1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash1)

        val button: Button = findViewById(R.id.button0)


        val intent: Intent = Intent(this, Splash2::class.java)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}

