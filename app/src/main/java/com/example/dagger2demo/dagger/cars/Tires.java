package com.example.dagger2demo.dagger.cars;

import android.util.Log;

public class Tires {
    /*we dont own this class so we cannot annotate with @inject*/
    private static final String TAG = "Tires";
    public void inflate(){
        Log.d(TAG, "inflate: Tires is running");
    }
        
}
