package com.sean.dagger2

import android.util.Log
import java.util.*
import javax.inject.Inject

class PetrolEngine: Engine {

    @Inject
    constructor() {

    }

    override fun start() {
        Log.i("ggg", "petrol engine start")
    }
}