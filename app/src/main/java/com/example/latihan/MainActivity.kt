package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnSay = findViewById<Button>(R.id.btnSay)
        val etHello = findViewById<EditText>(R.id.etHello)

        btnSay.setOnClickListener{
            val name = etName.text.toString()
            etHello.setText("Hello $name, kcawwww")

            Log.d("Name : ", "Hello $name")
        }
    }
}