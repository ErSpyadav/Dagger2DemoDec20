package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.dagger.cars.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }
}
