package com.ivanj.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class Splash : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val start:Button=findViewById(R.id.btnStart)

        Handler().postDelayed({
            start.setOnClickListener {
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        },3000)


    }
}