package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nilai_a = findViewById<EditText>(R.id.etNilaiA)
        val nilai_b = findViewById<EditText>(R.id.etNilaiB)
        val btnJml = findViewById<Button>(R.id.btnJml)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnJml.setOnClickListener{
            val n_a = nilai_a.text.toString().toInt()
            val n_b = nilai_b.text.toString().toInt()
            val n_jml = n_a + n_b
            tvHasil.text = n_jml.toString()
        }
    }
}