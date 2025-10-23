package com.example.a1pertemuan

import android.util.Log

open class Car {
    // Properties
    var kecepatanMax: Int = 200
    var merk: String = "Toyota"
    var warna: String = "Hitam"
    private var tahunProduksi: Int = 2024

    // Method
    open fun start() {
        Log.i("CarInfo", "Mobil $merk menyala dengan kecepatan max: $kecepatanMax km/jam")
    }

    fun stop() {
        Log.i("CarInfo", "Mobil $merk berhenti")
    }

    fun honk() {
        Log.i("CarInfo", "Tin tin! Mobil $merk membunyikan klakson")
    }

    // Getter dan Setter untuk property private
    fun setTahun(tahun: Int) {
        tahunProduksi = tahun
    }

    fun getTahun(): Int {
        return tahunProduksi
    }

    fun tampilkanDetail() {
        Log.i("CarInfo", "=== Detail Mobil ===")
        Log.i("CarInfo", "Merk: $merk")
        Log.i("CarInfo", "Warna: $warna")
        Log.i("CarInfo", "Kecepatan Max: $kecepatanMax km/jam")
        Log.i("CarInfo", "Tahun: $tahunProduksi")
    }
}