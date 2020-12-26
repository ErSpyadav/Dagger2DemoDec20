package com.example.dagger2demo.dagger.cars;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.dagger.modules.DieselEngineModule;
import com.example.dagger2demo.dagger.modules.WheelsModule;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity activity);
}
