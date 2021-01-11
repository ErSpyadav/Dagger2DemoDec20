package com.example.dagger2demo.dagger

import com.example.dagger2demo.dagger.cars.ActivityComponent
import com.example.dagger2demo.dagger.modules.DieselEngineModule
import com.example.dagger2demo.dagger.modules.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponent(dieselEngineModule: DieselEngineModule?): ActivityComponent?
}