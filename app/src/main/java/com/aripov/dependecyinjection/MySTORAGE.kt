package com.aripov.dependecyinjection

import android.util.Log

class MySTORAGE(
    val nvmeDrive: MyNVME
) {
    val wattage = nvmeDrive.wattage
    fun setupStorage() {
        Log.v("POSTING: ", "Init storage")
        nvmeDrive.setupNVME()
    }
}
