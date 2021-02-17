package com.sean.dagger2

import android.util.Log
import java.util.*
import javax.inject.Inject

class Car {

    @Inject
    lateinit var wheel: Wheel
    lateinit var engine: Engine

    @Inject
    constructor(engine: Engine) {
        this.engine = engine
    }

    @Inject
    fun provideCarToRemote(remote: Remote) {
        remote.providesCar(this)
    }

    fun start() {
        Log.i("ggg", "wheel : " + wheel)
        engine.start()
        Log.i("ggg", "car driving")
    }
}