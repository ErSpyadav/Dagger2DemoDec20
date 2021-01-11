package com.example.dagger2demo

import android.app.Application
import com.example.dagger2demo.dagger.AppComponent
import com.example.dagger2demo.dagger.DaggerAppComponent

class ExampleApp : Application() {
    var appComponent: AppComponent? = null
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}