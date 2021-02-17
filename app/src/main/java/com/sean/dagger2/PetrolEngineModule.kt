package com.sean.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    var powerCapacity: Int

    constructor(powerCapacity: Int) {
        this.powerCapacity = powerCapacity
    }

    @Provides
    fun providesPetrolEngine(): Engine {
        return PetrolEngine(this.powerCapacity)
    }

}