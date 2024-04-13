package com.aripov.dependecyinjection

import android.util.Log

class MyCOMPUTER(
    private val motherboard: MyMOTHERBOARD,
    private val psu: MyPSU
) {
    fun bootComputer() {
        if(psu.checkPowerCompliance()) {
            motherboard.setupMotherboard()
            motherboard.cpu.setupCPU()
            motherboard.ram.setupRAM()
            motherboard.gpu.setupGPU()
            motherboard.storage.setupStorage()
            Log.v("POSTING: ", "Computer booted successfully!")
        } else {
            Log.v("POSTING: ", "Computer failed to boot...")
        }
    }
}