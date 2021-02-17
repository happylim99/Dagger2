package com.sean.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // with just inject alone will not work,
    // because main activity is controlled by android
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.builder()
            .petrolEngineModule(PetrolEngineModule(200)).build()
        carComponent.inject(this)
        car.start()

    }
}
