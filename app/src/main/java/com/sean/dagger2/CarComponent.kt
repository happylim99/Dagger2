package com.sean.dagger2

import dagger.BindsInstance
import dagger.Component
// either petrol or diesel can be include
// we cannot include both
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
        fun powerCapacity(powerCapacity: Int): Builder

        fun build(): CarComponent
    }
}