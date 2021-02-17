package com.sean.dagger2

import android.util.Log
import java.util.*
import javax.inject.Inject

class PetrolEngine: Engine {

    var powerCapacity: Int

    @Inject
    constructor(powerCapacity: Int) {
        this.powerCapacity = powerCapacity
    }

    override fun start() {
        Log.i("ggg", "petrol engine start, capacity : " + powerCapacity)
    }
}