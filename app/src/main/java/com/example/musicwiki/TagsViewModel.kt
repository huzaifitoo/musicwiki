package com.example.musicwiki

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TagsViewModel: ViewModel() {

    private var mTagsRepository: TagsRepository = TagsRepository()

    private val mTagsLiveData: MutableLiveData<GenericResponse<List<TagsResponseModel>>> =
        MutableLiveData<GenericResponse<List<TagsResponseModel>>>()

    fun getTagsLiveData(): LiveData<GenericResponse<List<TagsResponseModel>>>{
        return mTagsLiveData

    }
    suspend fun getTags(){
        mTagsRepository.getTags(mTagsLiveData)
    }
}