package com.example.daggersample.dagger

import com.example.daggersample.car.DieselEngine
import com.example.daggersample.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine) : Engine

}