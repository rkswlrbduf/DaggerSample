package com.example.daggersample.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {

    fun drive() {
        engine.start()
        Log.d("TAG", "Driving...")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

}