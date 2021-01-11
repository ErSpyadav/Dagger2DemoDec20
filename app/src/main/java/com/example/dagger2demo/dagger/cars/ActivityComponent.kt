package com.example.dagger2demo.dagger.cars

import com.example.dagger2demo.dagger.PerActivity
import dagger.Subcomponent
import com.example.dagger2demo.dagger.modules.WheelsModule
import com.example.dagger2demo.dagger.modules.DieselEngineModule
import com.example.dagger2demo.mvvm.ViewModelFactoryModule
import com.example.dagger2demo.dagger.cars.Car
import com.example.dagger2demo.MainActivity

/*
 * Car instance will alive as long as Activity alive
 * @Subcomponent dont have dependency. But @Component have dependecy
 * */
@PerActivity
@Subcomponent(modules = [WheelsModule::class, DieselEngineModule::class, ViewModelFactoryModule::class])
interface ActivityComponent {
    val car: Car?
    fun inject(activity: MainActivity?) //    @Component.Builder
    //    interface Builder{
    //        @BindsInstance
    //        Builder horsePower(@Named("horse power") int horsePower);
    //        @BindsInstance
    //        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
    //        Builder appComponent(AppComponent appComponent);
    //        ActivityComponent build();
    //    }
}