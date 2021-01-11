package com.example.dagger2demo.dagger.cars

import android.util.Log
import com.example.dagger2demo.dagger.cars.Rim

class Rim {
    fun printRim() {
        Log.d(TAG, "printRim: Rim is running")
    }

    companion object {
        /*we dont own this class so we cannot annotate with @inject*/
        private const val TAG = "Rim"
    }
}