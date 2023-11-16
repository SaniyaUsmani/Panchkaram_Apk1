package com.example.panchkaram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.panchkaram.databinding.ActivitySplash3Binding

class Splash2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        val button: Button = findViewById(R.id.button2)

        val intent: Intent = Intent(this, Splash3::class.java)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}