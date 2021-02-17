package com.sean.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine

}