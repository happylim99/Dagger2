package com.sean.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // with just inject alone will not work,
    // because main activity is controlled by android
    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car1: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.builder()
            .powerCapacity(111)
            .engineCapacity(222)
            .build()
        carComponent.inject(this)

        var carComponent1 = DaggerCarComponent.builder()
            .powerCapacity(111)
            .engineCapacity(222)
            .build()
        carComponent1.inject(this)

        car = carComponent.getCar()
        car.start()
        car1 = carComponent1.getCar()
        car1.start()
    }
}
