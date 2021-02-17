package com.sean.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providesPetrolEngine(powerCapacity:Int): Engine {
        return PetrolEngine(powerCapacity)
    }

}