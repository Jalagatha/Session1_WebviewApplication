package com.ivanj.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val metro:WebView=findViewById(R.id.metro)
        metro.settings.javaScriptEnabled = true
        metro.loadUrl("https://miu.ac.ug/")

    }
}