package com.example.daggersample

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {

    fun drive() {
        Log.d("TAG", "Driving...")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

}