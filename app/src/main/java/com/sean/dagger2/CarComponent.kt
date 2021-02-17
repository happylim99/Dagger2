package com.sean.dagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

// either petrol or diesel can be include
// we cannot include both
@Singleton
@Component(modules = [
    PetrolEngineModule::class,
    WheelModule::class,
    MyModule::class
])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun powerCapacity(@Named("power")powerCapacity: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine")engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}