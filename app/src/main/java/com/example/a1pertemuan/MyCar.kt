package com.example.a1pertemuan

import android.util.Log

class MyCar : Car(), KontrolKecepatan {
    // Property tambahan untuk child class
    var fiturTambahan: String = "Sunroof"
    var kecepatanSekarang: Int = 0

    // Override method dari parent class Car
    override fun start() {
        Log.i("MyCarInfo", "🚗 MyCar menyala dengan sistem canggih!")
        Log.i("MyCarInfo", "Fitur tambahan: $fiturTambahan")
        super.start() // memanggil method parent
    }

    // Implementasi method dari interface KontrolKecepatan
    override fun gasss() {
        kecepatanSekarang += 20
        if (kecepatanSekarang > kecepatanMax) {
            kecepatanSekarang = kecepatanMax
        }
        Log.i("MyCarInfo", "⚡ GASSS! Kecepatan sekarang: $kecepatanSekarang km/jam")
    }

    override fun rem() {
        kecepatanSekarang -= 30
        if (kecepatanSekarang < 0) {
            kecepatanSexkarang = 0
        }
        Log.i("MyCarInfo", "🛑 REM! Kecepatan sekarang: $kecepatanSekarang km/jam")
    }

    fun tampilkanFitur() {
        Log.i("MyCarInfo", "Mobil ini dilengkapi dengan: $fiturTambahan")
    }
}