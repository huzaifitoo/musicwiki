package com.example.musicwiki

import retrofit2.Call
import retrofit2.http.GET

interface TagsApiInterface {
    @GET("?method=chart.gettoptags&api_key=468d73a677b2c9bb43fa3e1464f870b0&format=json")
  suspend  fun getTopTags(): Call<TagsResponseModel>
}
