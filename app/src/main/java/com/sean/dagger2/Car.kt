package com.sean.dagger2

import android.util.Log

class Car {

    lateinit var wheel: Wheel
    lateinit var engine: Engine

    constructor(wheel: Wheel, engine: Engine) {
        this.wheel = wheel
        this.engine = engine
    }

    fun start() {
        Log.i("tagg", "driving")
    }
}