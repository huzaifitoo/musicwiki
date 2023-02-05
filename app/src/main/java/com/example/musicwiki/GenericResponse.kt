package com.example.musicwiki

class GenericResponse<T>(
    val data: T?,
    val success: Boolean?,
    val message: String?
)
