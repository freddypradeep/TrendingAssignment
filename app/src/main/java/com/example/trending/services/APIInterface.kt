package com.example.trending.services

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {

    @GET("repositories")
    fun GetTrending(): Call<List<Trending>>

}