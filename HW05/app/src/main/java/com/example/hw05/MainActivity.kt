package com.example.hw05

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChangeActivity=findViewById<Button>(R.id.btnChangeActivity)
        val btnOpenBrowser=findViewById<Button>(R.id.btnOpenBrowser)

        btnChangeActivity.setOnClickListener{
            var seconIntent = Intent(this,SecondActivity::class.java)
            startActivity(seconIntent)
        }
        btnOpenBrowser.setOnClickListener{
            var thirIntent = Intent(this,ThirdActivity::class.java)
            startActivity(thirIntent)
        }
    }
}