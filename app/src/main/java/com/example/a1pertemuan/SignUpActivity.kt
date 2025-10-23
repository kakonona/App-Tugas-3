package com.example.a1pertemuan

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val tvSignUp3 = findViewById<TextView>(R.id.tvSignUp3)



        tvSignUp3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop dipanggil")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy dipanggil")
    }
}