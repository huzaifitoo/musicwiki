package com.example.musicwiki

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataSource {
    suspend fun getTags(data : MutableLiveData<GenericResponse<List<TagsResponseModel>>>) = TagsBuilderClient().getClient()
        .create(TagsApiInterface::class.java)
        .getTopTags()
        .enqueue(object : Callback<List<TagsResponseModel>> {
            override fun onResponse(
                call: Call<List<TagsResponseModel>>,
                response: Response<List<TagsResponseModel>>
            ) {
                if (response.isSuccessful){
                    data.value = GenericResponse<List<TagsResponseModel>>(
                        response.body(),
                        true,
                        null
                    )
                }else{
                    data.value = GenericResponse<List<TagsResponseModel>>(
                        null,
                        false,
                        response.message()
                    )
                }
            }

            override fun onFailure(call: Call<List<TagsResponseModel>>, t: Throwable) {
                data.value = GenericResponse<List<TagsResponseModel>>(
                    null,
                    false,
                    t.message
                )
            }

        })
}