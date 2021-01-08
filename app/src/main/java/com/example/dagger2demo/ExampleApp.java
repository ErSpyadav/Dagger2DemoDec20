package com.example.dagger2demo;

import android.app.Application;

import com.example.dagger2demo.dagger.AppComponent;
import com.example.dagger2demo.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
   AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
      appComponent = DaggerAppComponent.create();
    }
    public AppComponent getActivityComponent(){
        return appComponent;
    }
}
