package com.sean.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wheel = Wheel()
        var engine = Engine()

        car = Car(wheel, engine)

        car.start()

    }
}
