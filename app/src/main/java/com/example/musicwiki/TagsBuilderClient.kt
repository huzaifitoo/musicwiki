package com.example.musicwiki

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TagsBuilderClient {
    private lateinit var retrofit: Retrofit

    fun getClient(): Retrofit {
        retrofit = Retrofit
            .Builder()
            .baseUrl("https://ws.audioscrobbler.com/2.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit
    }

}
