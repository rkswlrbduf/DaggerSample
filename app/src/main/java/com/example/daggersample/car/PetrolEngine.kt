package com.example.daggersample.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d("TAG", "Petrol Engine Started")
    }

}