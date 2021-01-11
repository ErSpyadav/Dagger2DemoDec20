package com.example.dagger2demo.dagger.cars

import android.util.Log

class Tires {
    fun inflate() {
        Log.d(TAG, "inflate: Tires is running")
    }

    companion object {
        /*we dont own this class so we cannot annotate with @inject*/
        private const val TAG = "Tires"
    }
}