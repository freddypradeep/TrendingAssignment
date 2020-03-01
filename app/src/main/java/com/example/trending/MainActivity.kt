package com.example.trending

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.trending.mvvmcomponenets.MyViewModel


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
    }

    /*Intialize View Model*/
    private fun initViewModel() {
        val myViewModel: MyViewModel? = ViewModelProvider(this).get(MyViewModel::class.java)
        myViewModel!!.MyViewModel(application)
        //This is the method which calls the Method in view Model for the data
        myViewModel.getData()
    }
}