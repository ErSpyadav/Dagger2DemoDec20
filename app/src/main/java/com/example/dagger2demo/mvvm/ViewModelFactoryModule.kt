package com.example.dagger2demo.mvvm

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module
abstract class ViewModelFactoryModule {
    @Binds
    @Reusable
    abstract fun viewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
