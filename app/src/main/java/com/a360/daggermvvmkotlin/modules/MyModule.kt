package com.a360.daggermvvmkotlin.modules

import androidx.lifecycle.ViewModelProvider
import com.a360.daggermvvmkotlin.factory.MyViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class MyModule {

    @Binds
    abstract fun bindViewModelFactory(factory:MyViewModelFactory): ViewModelProvider.Factory
}