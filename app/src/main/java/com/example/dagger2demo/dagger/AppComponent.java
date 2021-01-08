package com.example.dagger2demo.dagger;

import com.example.dagger2demo.dagger.cars.Driver;
import com.example.dagger2demo.dagger.modules.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
