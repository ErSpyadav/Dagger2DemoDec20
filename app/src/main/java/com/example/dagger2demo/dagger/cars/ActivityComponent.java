package com.example.dagger2demo.dagger.cars;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.dagger.AppComponent;
import com.example.dagger2demo.dagger.PerActivity;
import com.example.dagger2demo.dagger.modules.PetrolEngineModule;
import com.example.dagger2demo.dagger.modules.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/*
 * Car instance will alive as long as Activity alive
 *
 * */
@PerActivity
@Component(dependencies = AppComponent.class,modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        Builder appComponent(AppComponent appComponent);
        ActivityComponent build();
    }
}
