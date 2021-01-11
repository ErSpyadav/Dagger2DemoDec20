package com.example.dagger2demo.dagger.cars

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {
    override fun start() {
        Log.d(TAG, "Diesel Engine started. HorsePower: $horsePower")
    }

    companion object {
        private const val TAG = "Car"
    }
}