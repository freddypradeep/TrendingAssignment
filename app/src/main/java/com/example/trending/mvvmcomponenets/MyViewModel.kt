package com.example.trending.mvvmcomponenets

import android.app.Application
import androidx.lifecycle.ViewModel


class MyViewModel : ViewModel() {

    var mRepository: MyRepository? = null
    /*get application context which is used in the repository for the Data binding of the views*/
    fun MyViewModel(application: Application) {
        mRepository = MyRepository.getInstance(application.applicationContext)
    }

    //function calls repository view model to fetch data
    fun getData() {
        mRepository!!.getData()
    }


}