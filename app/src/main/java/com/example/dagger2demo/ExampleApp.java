package com.example.dagger2demo;

import android.app.Application;

import com.example.dagger2demo.dagger.cars.CarComponent;
import com.example.dagger2demo.dagger.cars.DaggerCarComponent;

public class ExampleApp extends Application {
   CarComponent carComponent ;
    @Override
    public void onCreate() {
        super.onCreate();
         carComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(125)
                .build();
    }
    public CarComponent getCarComponent(){
        return carComponent;
    }
}
