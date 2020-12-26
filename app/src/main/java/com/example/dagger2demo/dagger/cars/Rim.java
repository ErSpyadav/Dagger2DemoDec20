package com.example.dagger2demo.dagger.cars;

import android.util.Log;

public class Rim {
    /*we dont own this class so we cannot annotate with @inject*/
    private static final String TAG = "Rim";
public void printRim(){
    Log.d(TAG, "printRim: Rim is running");
}
}
