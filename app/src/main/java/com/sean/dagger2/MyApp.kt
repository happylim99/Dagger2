package com.sean.dagger2

import android.app.Application

class MyApp: Application() {

    lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerCarComponent.builder()
            .powerCapacity(111)
            .engineCapacity(222)
            .build()
    }

    fun carComponent(): CarComponent {
        return carComponent
    }
}