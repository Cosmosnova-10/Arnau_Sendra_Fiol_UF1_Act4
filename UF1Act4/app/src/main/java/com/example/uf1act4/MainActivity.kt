package com.example.uf1act4

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLogcat = findViewById<Button>(R.id.button3)
        val buttonToast = findViewById<Button>(R.id.button2)

        buttonLogcat.setOnClickListener {
            Log.d("MainActivity", "boto apretat")
        }

        buttonToast.setOnClickListener {
            Toast.makeText(this, "boto apretat", Toast.LENGTH_SHORT).show()
        }
    }
}