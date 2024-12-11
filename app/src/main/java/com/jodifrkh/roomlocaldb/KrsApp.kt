package com.jodifrkh.roomlocaldb

import android.app.Application
import com.jodifrkh.roomlocaldb.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    // berfungsi untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        // Membuat instance ContainerApp
        containerApp = ContainerApp(this)
        // instance adalah object yang dibuat dari class
    }
}