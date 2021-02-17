package com.sean.dagger2

import javax.inject.Inject

class Wheel {

    lateinit var rim: Rim
    lateinit var tire: Tire

    constructor(rim: Rim, tire: Tire) {
        this.rim = rim
        this.tire = tire
    }
}