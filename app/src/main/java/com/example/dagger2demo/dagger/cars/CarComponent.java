package com.example.dagger2demo.dagger.cars;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.dagger.modules.DieselEngineModule;
import com.example.dagger2demo.dagger.modules.PetrolEngineModule;
import com.example.dagger2demo.dagger.modules.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        CarComponent build();
    }
}
