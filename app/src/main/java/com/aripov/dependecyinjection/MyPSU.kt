package com.aripov.dependecyinjection

import android.util.Log

class MyPSU(
    private val motherboard: MyMOTHERBOARD
) {
    private val ratedWattage = 1000
    fun checkPowerCompliance() : Boolean {
        val powerDraw = motherboard.wattage + motherboard.cpu.wattage + motherboard.gpu.wattage + motherboard.ram.wattage + motherboard.storage.wattage
        if(powerDraw < ratedWattage) {
            Log.v("POSTING: ", "Power draw within PSU limits.")
            return true
        }
        Log.v("POSTING: ", "Power draw outside PSU limits.\nPOST failed.")
        return false
    }
}
