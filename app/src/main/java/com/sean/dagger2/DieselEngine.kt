package com.sean.dagger2

import android.util.Log
import java.util.*
import javax.inject.Inject

class DieselEngine: Engine {

    @Inject
    constructor() {

    }

    override fun start() {
        Log.i("ggg", "diesel engine start")
    }
}