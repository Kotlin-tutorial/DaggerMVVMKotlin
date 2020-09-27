package com.a360.daggermvvmkotlin.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.a360.daggermvvmkotlin.viewmodels.MyViewModel
import javax.inject.Inject
import javax.inject.Provider

class MyViewModelFactory @Inject constructor(private val myViewModelProvider: Provider<MyViewModel>): ViewModelProvider.Factory  {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return myViewModelProvider.get() as T
    }
}