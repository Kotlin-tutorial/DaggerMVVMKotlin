package com.a360.daggermvvmkotlin.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.a360.daggermvvmkotlin.repositories.Repository
import javax.inject.Inject

class MyViewModel @Inject constructor( private val repository: Repository): ViewModel() {


    var resultData = MutableLiveData<String>()

    fun getDataViewModel(): String {
        val myDaggerName = repository.getData()
        return myDaggerName
    }

    fun callLiveData(){
        repository.getMyMutableData()
    }

    fun callMyLiveData(): MutableLiveData<String> {
        resultData = repository.getMyLiveData()
        return resultData
    }
}