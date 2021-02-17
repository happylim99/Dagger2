package com.sean.dagger2

import android.util.Log
import com.sean.dagger2.Driver
import java.util.*
import javax.inject.Inject

class Car {

    @Inject
    lateinit var wheel: Wheel
    lateinit var engine: Engine
    lateinit var driver: Driver

    @Inject
    constructor(engine: Engine, driver: Driver) {
        this.engine = engine
        this.driver = driver
    }

    @Inject
    fun provideCarToRemote(remote: Remote) {
        remote.providesCar(this)
    }

    fun start() {
        Log.i("ggg", "wheel : " + wheel)
        engine.start()
        Log.i("ggg", "driver : " + driver)
    }
}