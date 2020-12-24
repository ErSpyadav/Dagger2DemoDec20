package com.example.dagger2demo.dagger;

import android.app.Activity;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    void inject(MainActivity activity);
}
