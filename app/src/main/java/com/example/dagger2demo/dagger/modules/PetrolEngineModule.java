package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.dagger.cars.Engine;
import com.example.dagger2demo.dagger.cars.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
   @Binds
   abstract Engine bindEngine(PetrolEngine engine);
}
