package com.example.musicwiki

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicwiki.databinding.RowItemGenreBinding

class TagsAdapter(var context: Context, val mlist: ArrayList<TagItem>): RecyclerView.Adapter<TagsAdapter.TagsViewHolder>() {
    class TagsViewHolder(val binding: RowItemGenreBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(list: TagItem){
            binding.tvGenre.text= list.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagsViewHolder {
        val binding = RowItemGenreBinding.inflate(LayoutInflater.from( parent.context),parent,false)
        return TagsViewHolder(binding)
    }

    override fun getItemCount(): Int {
     return mlist.size
    }

    override fun onBindViewHolder(holder: TagsViewHolder, position: Int) {
       val list = mlist[position]
        holder.bind(list)

    }
}