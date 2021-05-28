package com.example.hw4_nicholasblake

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)
        val backButton = findViewById<Button>(R.id.button4)
        if (ContextCompat.checkSelfPermission(
                this@PermissionActivity,
                android.Manifest.permission.CAMERA
            ) !== PackageManager.PERMISSION_GRANTED
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this@PermissionActivity,
                    android.Manifest.permission.CAMERA
                )
            ) {
                ActivityCompat.requestPermissions(
                    this@PermissionActivity,
                    arrayOf(android.Manifest.permission.CAMERA),
                    1
                )

            } else {
                ActivityCompat.requestPermissions(
                    this@PermissionActivity,
                    arrayOf(android.Manifest.permission.CAMERA),
                    1
                )
            }
        }
        backButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent) }
    }
        override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
        ) {
            when (requestCode) {
                1 -> {
                    if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        if ((ContextCompat.checkSelfPermission(
                                this@PermissionActivity,
                                android.Manifest.permission.CAMERA
                            ) == PackageManager.PERMISSION_GRANTED)
                        ) {
                            Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
                    }
                    return
                }
            }
        }

    }



