package com.sean.dagger2

import android.util.Log
import java.util.*
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine: Engine {

    var powerCapacity: Int
    var engineCapacity: Int

    @Inject
    constructor(@Named("power")powerCapacity: Int, @Named("engine")engineCapacity: Int) {
        this.powerCapacity = powerCapacity
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        Log.i("ggg", "petrol engine start, capacity : " + powerCapacity + " engineCap : "+ engineCapacity)
    }
}