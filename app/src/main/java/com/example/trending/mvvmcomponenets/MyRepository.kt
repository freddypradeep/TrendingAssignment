package com.example.trending.mvvmcomponenets

import android.content.Context
import android.util.Log
import com.example.trending.services.APIClient
import com.example.trending.services.APIInterface
import com.example.trending.services.Trending
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyRepository(context: Context?) {

    val TAG = MyRepository::class.java.canonicalName as String

    var apiInterface: APIInterface? = APIClient.getClient()!!.create(APIInterface::class.java)

    companion object {
        private var ourInstance: MyRepository? = null
        fun getInstance(context: Context?): MyRepository? {
            if (ourInstance == null) {
                ourInstance = MyRepository(context)

            }
            return ourInstance
        }
    }

    /*Retrofit method used to call the web services for the data*/
    fun getData() {
        val call: Call<List<Trending>> = apiInterface!!.GetTrending()
        call.enqueue(object : Callback<List<Trending>> {

            override fun onResponse(
                call: Call<List<Trending>>?,
                response: Response<List<Trending>>?
            ) {
                Log.i(TAG, "hello")
                Log.i(TAG, response!!.body()!!.toString())

            }

            override fun onFailure(call: Call<List<Trending>>?, t: Throwable?) {
                Log.i(TAG, "error")
            }

        })

    }
}