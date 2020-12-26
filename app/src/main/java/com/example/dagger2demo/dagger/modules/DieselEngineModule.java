package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.dagger.cars.DieselEngine;
import com.example.dagger2demo.dagger.cars.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
