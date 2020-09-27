package com.a360.daggermvvmkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.a360.daggermvvmkotlin.Components.DaggerMyComponent
import com.a360.daggermvvmkotlin.Components.MyComponent
import com.a360.daggermvvmkotlin.viewmodels.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var factory: ViewModelProvider.Factory
    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMyComponent.create().inject(this)
        myViewModel = ViewModelProviders.of(this,factory).get(MyViewModel::class.java)

        // my_text.text =  myViewModel.getDataViewModel()
        myViewModel.callLiveData()

        myViewModel.callMyLiveData().observe(this, Observer {
            my_text.text = it
        })

    }



}