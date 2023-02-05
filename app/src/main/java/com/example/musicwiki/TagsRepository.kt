package com.example.musicwiki

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TagsRepository {

    private var mDataSource : DataSource = DataSource()
    suspend fun getTags(data: MutableLiveData<GenericResponse<List<TagsResponseModel>>>) = mDataSource.getTags(data)


}