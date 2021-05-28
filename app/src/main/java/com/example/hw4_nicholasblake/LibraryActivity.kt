package com.example.hw4_nicholasblake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tapadoo.alerter.Alerter

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        val backButton = findViewById<Button>(R.id.button5)

val ba1 = findViewById<Button>(R.id.balert1)
        ba1.setOnClickListener(){
            alert1()
        }


        backButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent) }
    }
    private fun alert1(){
        Alerter.create(this)
            .setTitle("Alert Title")
            .setText("Alert text...")
            .show()
    }
    }
