package com.example.a1pertemuan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView
import android.view.View
import android.util.Log
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // KODE LOGIN YANG SUDAH ADA
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val tvSignUp4 = findViewById<TextView>(R.id.tvSignUp4)

        tvTitle.text = "Welcome"
        tvSignUp4.visibility = View.GONE

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login berhasil untuk $email", Toast.LENGTH_SHORT).show()

                // PANGGIL FUNCTION TESTING OOP SETELAH LOGIN BERHASIL
                testingOOP()
            } else {
                Toast.makeText(this, "Email dan Password harus diisi", Toast.LENGTH_SHORT).show()
            }
        }

        tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            Log.i("MainActivity", "Berpindah ke SignUpActivity")
        }
    }

    // FUNCTION BARU UNTUK TESTING OOP
    private fun testingOOP() {
        Log.i("MainActivity", "\n========== TESTING OOP DIMULAI ==========\n")

        // 1. TESTING CLASS CAR DAN OBJECT
        Log.i("MainActivity", "--- 1. Testing Class Car ---")
        val mobilSaya = Car()
        mobilSaya.merk = "Honda"
        mobilSaya.warna = "Merah"
        mobilSaya.kecepatanMax = 250
        mobilSaya.setTahun(2023)
        mobilSaya.start()
        mobilSaya.tampilkanDetail()
        mobilSaya.honk()
        mobilSaya.stop()

        // 2. TESTING CONSTRUCTOR DAN INIT
        Log.i("MainActivity", "\n--- 2. Testing Constructor Driver ---")
        val supir = Driver("Asep Kurniawan")
        supir.umur = 30
        supir.nomorSIM = "SIM-12345"
        supir.tampilkanDetail()

        // 3. TESTING VISIBILITY - PRIVATE VS PUBLIC
        Log.i("MainActivity", "\n--- 3. Testing Visibility ---")
        // mobilSaya.tahunProduksi = 2025 // ERROR! karena private
        mobilSaya.setTahun(2025) // Harus pakai setter
        Log.i("MainActivity", "Tahun produksi (via getter): ${mobilSaya.getTahun()}")
        Log.i("MainActivity", "Merk (public): ${mobilSaya.merk}") // OK karena public

        // 4. TESTING INHERITANCE
        Log.i("MainActivity", "\n--- 4. Testing Inheritance (MyCar extends Car) ---")
        val mycar = MyCar()
        mycar.merk = "Tesla"
        mycar.warna = "Putih"
        mycar.kecepatanMax = 300
        mycar.fiturTambahan = "Autopilot + Sunroof + Premium Sound"
        mycar.start() // method dari parent dan override
        mycar.tampilkanFitur() // method dari child

        // 5. TESTING METHOD OVERRIDING
        Log.i("MainActivity", "\n--- 5. Testing Method Overriding ---")
        Log.i("MainActivity", "Car biasa:")
        mobilSaya.start()
        Log.i("MainActivity", "MyCar (sudah di-override):")
        mycar.start()

        // 6. TESTING INTERFACE IMPLEMENTATION
        Log.i("MainActivity", "\n--- 6. Testing Interface KontrolKecepatan ---")
        mycar.statusKecepatan() // dari interface (default implementation)
        Log.i("MainActivity", "Merk dari interface: ${mycar.cekMerk()}")
        mycar.gasss()
        mycar.gasss()
        mycar.gasss()
        mycar.rem()
        mycar.rem()

        // 7. TESTING INTERAKSI ANTAR CLASS
        Log.i("MainActivity", "\n--- 7. Testing Interaksi Driver dengan Car ---")
        supir.mengendaraiMobil(mycar)

        Log.i("MainActivity", "\n========== TESTING OOP SELESAI ==========\n")
    }

    // LIFECYCLE METHODS YANG SUDAH ADA
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