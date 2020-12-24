package com.example.dagger2demo.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "Engine";
    @Inject
    public Engine() {
    }
    public void engineName(){
        Log.d(TAG, "engineName: Alto Engine");
    }
}
