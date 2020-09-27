package com.a360.daggermvvmkotlin.Components

import com.a360.daggermvvmkotlin.MainActivity
import com.a360.daggermvvmkotlin.modules.MyModule
import com.a360.daggermvvmkotlin.viewmodels.MyViewModel
import dagger.Component

@Component (modules = [MyModule::class])
interface MyComponent {
    fun inject (activity:MainActivity)
}