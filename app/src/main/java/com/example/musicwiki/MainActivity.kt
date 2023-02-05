package com.example.musicwiki

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.musicwiki.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mTagsViewModel: TagsViewModel
    private var mTags: List<TagsResponseModel> = arrayListOf()


    override suspend fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mTagsViewModel = ViewModelProvider(this).get(TagsViewModel::class.java)
        mTagsViewModel.getTags()

        mTagsViewModel.getTagsLiveData().observe(this)
        {
            if (!it.success!!) return@observe
            if (it.data==null)return@observe
            mTags= it.data

            Log.d("Data", it.data.toString())

        }
//        val tagsApi = TagsBuilderClient().getClient()
//            .create(TagsApiInterface::class.java)
//        tagsApi.getTopTags().enqueue(object : Callback<TagsResponseModel> {
//            override fun onResponse(
//                call: Call<TagsResponseModel>,
//                response: Response<TagsResponseModel>
//            ) {
//                Log.d("Data", response.body().toString())
//
//                mlist.addAll(response.body()?.tags?.tag!! as ArrayList<TagItem>)
//                val recyclerView = binding.rcGenre
//                val adapter = TagsAdapter(this@MainActivity, mlist)
//                recyclerView.adapter = adapter
//            }
//            override fun onFailure(call: Call<TagsResponseModel>, t: Throwable) {
//                Log.d("error due to:", t.message.toString())
//            }

//        })
    }

}
