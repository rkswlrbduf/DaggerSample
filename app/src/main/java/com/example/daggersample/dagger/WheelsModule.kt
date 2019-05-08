package com.example.daggersample.dagger

import com.example.daggersample.car.Rims
import com.example.daggersample.car.Tires
import com.example.daggersample.car.Wheels
import dagger.Module
import dagger.Provides

@Module
object WheelsModule {

    @JvmStatic
    @Provides
    fun provideRims(): Rims = Rims()

    @JvmStatic
    @Provides
    fun provideTires(): Tires = Tires().also { it.inflate() }

    @JvmStatic
    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels =
        Wheels(rims, tires)

}