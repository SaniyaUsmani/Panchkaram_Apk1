package com.example.panchkaram

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Splash1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash1)

        val button: Button = findViewById(R.id.button)

        val intent: Intent = Intent(this, Splash2::class.java)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}

//package com.example.panchkaram
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//
//class Splash1 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash1)
//
//        Button button;
//        button = findViewById(R.id.button);
//
//        Intent ibutton;
//        ibutton = new Intent(this, Splash2.class);
//        button.setOnClickListner(new View.OnClicklistner(){
//            @Override
//            public void onClick(View){startActivity(ibutton);}
//        });
//    }
//}