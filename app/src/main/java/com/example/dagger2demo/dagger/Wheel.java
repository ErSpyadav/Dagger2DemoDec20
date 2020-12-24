package com.example.dagger2demo.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Wheel {
    private static final String TAG = "Wheel";
   @Inject
    public Wheel() {
    }
    public void wheelName(){
        Log.d(TAG, "wheelName: Alto Wheel");
    }
}

