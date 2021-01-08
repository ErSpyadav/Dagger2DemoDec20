package com.example.dagger2demo.dagger.cars;

import android.util.Log;

import com.example.dagger2demo.dagger.PerActivity;

import javax.inject.Inject;
/*
* Car instance will alive as long as Activity alive
*
* */


@PerActivity
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
