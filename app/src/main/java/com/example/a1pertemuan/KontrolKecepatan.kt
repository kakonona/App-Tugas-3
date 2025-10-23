package com.example.a1pertemuan

interface KontrolKecepatan {
    // Fungsi abstrak (wajib diimplementasikan)
    fun gasss()
    fun rem()

    // Fungsi dengan implementasi default
    fun cekMerk(): String {
        return "HONDA"
    }

    fun statusKecepatan() {
        android.util.Log.i("KontrolInfo", "Sistem kontrol kecepatan aktif")
    }
}