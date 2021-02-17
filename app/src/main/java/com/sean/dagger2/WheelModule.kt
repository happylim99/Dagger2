package com.sean.dagger2

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun providesRim(): Rim {
        Log.i("ggg", "wheel module rim")
        return Rim()
    }

    @Provides
    fun providesTire(): Tire {
        Log.i("ggg", "wheel module tire")
        return Tire()
    }

    @Provides
    fun providesWheel(rim: Rim, tire: Tire): Wheel {
        return Wheel(rim, tire)
    }

}