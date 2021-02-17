package com.sean.dagger2

import android.util.Log
import java.util.*
import javax.inject.Inject

class Car {

    lateinit var wheel: Wheel
    lateinit var engine: Engine

    @Inject
    constructor(wheel: Wheel, engine: Engine) {
        this.wheel = wheel
        this.engine = engine
    }

    @Inject
    fun provideCarToRemote(remote: Remote) {
        remote.providesCar(this)
    }

    fun start() {
        engine.start()
//        Log.i("ggg", "driving")
    }
}