package com.example.dagger2demo.dagger.cars

import android.util.Log
import com.example.dagger2demo.dagger.PerActivity
import javax.inject.Inject

/*
* Car instance will alive as long as Activity alive
*
* */
@PerActivity
class Car @Inject constructor(private val driver: Driver, private val engine: Engine, private val wheel: Wheel) {
    fun drive() {
        engine.start()
        Log.d(TAG, "drive: Driving by $driver")
    }

    companion object {
        private const val TAG = "Car"
    }
}