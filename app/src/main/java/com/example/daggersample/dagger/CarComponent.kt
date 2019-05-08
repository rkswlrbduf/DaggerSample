package com.example.daggersample.dagger

import com.example.daggersample.MainActivity
import dagger.Component

@Component(modules = arrayOf(WheelsModule::class, DieselEngineModule::class))
interface CarComponent {

     fun inject(mainActivity: MainActivity)

}