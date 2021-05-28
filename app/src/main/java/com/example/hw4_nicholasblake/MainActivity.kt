package com.example.hw4_nicholasblake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiButton = findViewById<Button>(R.id.button);
        val libraryButton = findViewById<Button>(R.id.button2);
        val permissionButton = findViewById<Button>(R.id.button3);

       apiButton.setOnClickListener{
            val intent = Intent(this,APIActivity::class.java)
            startActivity(intent)}
        libraryButton.setOnClickListener {
            val intent = Intent (this,LibraryActivity::class.java)
            startActivity(intent) }
        permissionButton.setOnClickListener {
            val intent = Intent (this,PermissionActivity::class.java)
            startActivity(intent) }

    }
}