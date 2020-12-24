package com.example.dagger2demo.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    Rim provideRim(){
        return new Rim();
    }
    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }
    /*Here Rim and Tire object will taken from above while injecting*/
    @Provides
    Wheel provideWheel(Rim rim,Tires tires) {
        return new Wheel(rim, tires);
    }
}
