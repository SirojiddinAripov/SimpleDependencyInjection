package com.aripov.dependecyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myMotherboard = MyMOTHERBOARD(
            MyCPU(),
            MyGPU(),
            MyRAM(),
            MySTORAGE(MyNVME()),
        )
        val myPowerSupply = MyPSU(
            myMotherboard
        )
        val myComputer = MyCOMPUTER(
            myMotherboard,
            myPowerSupply
        )

        myComputer.bootComputer()
    }
}