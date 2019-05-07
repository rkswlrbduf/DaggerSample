package com.example.daggersample

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
    fun provideWheels(rims: Rims, tires: Tires): Wheels = Wheels(rims, tires)

}