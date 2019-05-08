package com.example.daggersample.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d("TAG", "Diesel Engine Started")
    }

}