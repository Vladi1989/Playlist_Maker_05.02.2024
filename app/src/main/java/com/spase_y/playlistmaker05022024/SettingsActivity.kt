package com.spase_y.playlistmaker05022024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backFromSetting = findViewById<ImageButton>(R.id.buttonBack)
        backFromSetting.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}