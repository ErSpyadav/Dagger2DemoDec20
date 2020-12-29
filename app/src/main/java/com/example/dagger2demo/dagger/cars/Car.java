package com.example.dagger2demo.dagger.cars;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Driver driver;
    private Engine engine;
    private Wheel wheel;
    @Inject
    public Car(Driver driver,Engine engine, Wheel wheel) {
        this.driver = driver;
        this.engine = engine;
        this.wheel = wheel;
    }
    public void drive(){
        engine.start();
        Log.d(TAG, "drive: Driving by "+driver);
    }

}
