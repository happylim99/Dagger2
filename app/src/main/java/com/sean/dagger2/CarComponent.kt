package com.sean.dagger2

import dagger.Component
// either petrol or diesel can be include
// we cannot include both
@Component(modules = [PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}