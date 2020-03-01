package com.example.trending.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIClient {
    companion object {
        private const val URL = "https://github-trending-api.now.sh/"
        fun getClient(): Retrofit? {

            return Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClient().newBuilder().build())
                .build()
        }
    }
}