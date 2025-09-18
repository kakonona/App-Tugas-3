package com.example.a1pertemuan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = "Welcome"

        // Pindah ke SignUpActivity
        tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        // Pindah ke ForgotPasswordActivity
        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        // Login button
        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login berhasil untuk $email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email dan Password harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
