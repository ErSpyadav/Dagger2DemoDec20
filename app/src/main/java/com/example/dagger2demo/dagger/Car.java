package com.example.dagger2demo.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheel wheel;
    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
    public void drive(){
        Log.d(TAG, "drive: Driving");
        engine.engineName();
        wheel.wheelName();
    }

}
