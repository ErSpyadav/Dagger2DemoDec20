package com.example.dagger2demo.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Wheel {
    private static final String TAG = "Wheel";
   Rim rim;
   Tires tires;
   /*we dont own this class so we cannot annotate with @inject*/

    public Wheel(Rim rim,Tires tires) {
        this.rim =rim;
        this.tires =tires;
    }

}

