package com.a360.daggermvvmkotlin.repositories

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class Repository @Inject constructor() {

    val mutableLivaData = MutableLiveData<String>()

    fun getData():  String {
        return "This is Dagget MVVM"
    }

    fun getMyMutableData(){
        mutableLivaData.value = "This is LiveData Dagger"
    }

    fun getMyLiveData() : MutableLiveData<String>{
        return mutableLivaData
    }
}