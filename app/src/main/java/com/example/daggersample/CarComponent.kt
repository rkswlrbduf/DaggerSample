package com.example.daggersample

import dagger.Component

@Component(modules = arrayOf(WheelsModule::class))
interface CarComponent {

     fun inject(mainActivity: MainActivity)

}