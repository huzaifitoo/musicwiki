package com.example.musicwiki

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.RawValue

@Parcelize
data class TagsResponseModel(

	@field:SerializedName("tags")
	val tags: Tags? = null
) : Parcelable

@Parcelize
data class Wiki(

	val any: @RawValue Any? = null
) : Parcelable

@Parcelize
data class Attr(

	@field:SerializedName("total")
	val total: String? = null,

	@field:SerializedName("perPage")
	val perPage: String? = null,

	@field:SerializedName("totalPages")
	val totalPages: String? = null,

	@field:SerializedName("page")
	val page: String? = null
) : Parcelable

@Parcelize
data class Tags(

	@field:SerializedName("@attr")
	val attr: Attr? = null,

	@field:SerializedName("tag")
	val tag: List<TagItem?>? = null
) : Parcelable

@Parcelize
data class TagItem(

	@field:SerializedName("streamable")
	val streamable: String? = null,

	@field:SerializedName("reach")
	val reach: String? = null,

	@field:SerializedName("wiki")
	val wiki: Wiki? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("taggings")
	val taggings: String? = null,

	@field:SerializedName("url")
	val url: String? = null
) : Parcelable
