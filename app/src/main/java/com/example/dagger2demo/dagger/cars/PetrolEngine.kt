package com.example.dagger2demo.dagger.cars

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@param:Named("horse power") var horsePower: Int, @param:Named("engine capacity") var engineCapacity: Int) : Engine {
    override fun start() {
        Log.d(TAG, """Petrol Engine started . 
HorsePower :$horsePower +
EngineCapaciry:$engineCapacity""")
    }

    companion object {
        private const val TAG = "Car"
    }
}