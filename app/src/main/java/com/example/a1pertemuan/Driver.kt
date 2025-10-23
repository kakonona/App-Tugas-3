package com.example.a1pertemuan

import android.util.Log

class Driver(nama: String) {
    // Properties
    private var namaDriver: String
    var umur: Int = 25
    var nomorSIM: String = ""

    // Init block - dijalankan saat object dibuat
    init {
        namaDriver = nama
        Log.i("DriverInfo", "Driver $namaDriver telah dibuat")
    }

    // Method
    fun tampilkanDetail() {
        Log.i("DriverInfo", "=== Detail Driver ===")
        Log.i("DriverInfo", "Nama: $namaDriver")
        Log.i("DriverInfo", "Umur: $umur tahun")
        Log.i("DriverInfo", "Nomor SIM: $nomorSIM")
    }

    fun mengendaraiMobil(mobil: Car) {
        Log.i("DriverInfo", "$namaDriver mengendarai mobil ${mobil.merk}")
        mobil.start()
    }
}