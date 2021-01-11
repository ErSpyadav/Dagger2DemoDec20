package com.example.dagger2demo.dagger.cars

class Wheel     /*we dont own this class so we cannot annotate with @inject*/(var rim: Rim, var tires: Tires) {
    companion object {
        private const val TAG = "Wheel"
    }
}