package com.sean.dagger2

import android.util.Log
import javax.inject.Inject

class Remote {

    lateinit var car: Car

    @Inject
    constructor() {

    }

    fun providesCar(car: Car) {
        Log.i("ggg", "remote provides car")
        this.car = car
    }
}