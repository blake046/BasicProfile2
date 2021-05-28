package com.example.hw4_nicholasblake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.hw4_nicholasblake.Repository
class APIActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_p_i)

        val backButton = findViewById<Button>(R.id.button6)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("Responses", response.userId.toString())
            Log.d("Responses", response.id.toString())
            Log.d("Responses", response.title)
            Log.d("Responses", response.body)
            Toast.makeText(this@APIActivity,response.title,Toast.LENGTH_SHORT).show()
            Toast.makeText(this,response.body,Toast.LENGTH_SHORT).show()
        })

        backButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent) }
    }
    }
