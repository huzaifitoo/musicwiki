package com.example.musicwiki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.musicwiki.databinding.ActivityMain2Binding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var viewPagerAdapter : ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapter(this)
        viewPagerAdapter.addFragment(AlbumFragment.newInstance())
        viewPagerAdapter.addFragment(ArtistsFragment.newInstance())
        viewPagerAdapter.addFragment(TracksFragment.newInstance())

        binding.vpHome.adapter = viewPagerAdapter

        TabLayoutMediator(binding.tlHome, binding.vpHome) { tab, position ->
            when(position){
                0 -> { tab.text = "ALBUMS" }
                1 -> { tab.text = "ARTISTS" }
                else ->  { tab.text = "TRACKS" }
            }
        }.attach()

    }
}


