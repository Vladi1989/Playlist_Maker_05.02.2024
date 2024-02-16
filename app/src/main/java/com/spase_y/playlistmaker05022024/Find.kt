package com.spase_y.playlistmaker05022024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class Find : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)

        val arrowBack = findViewById<ImageButton>(R.id.buttonBack)
        arrowBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}