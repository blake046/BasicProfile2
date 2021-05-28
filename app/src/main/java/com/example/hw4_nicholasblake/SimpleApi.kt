package com.example.hw4_nicholasblake
import com.example.hw4_nicholasblake.Post
import retrofit2.http.GET
interface SimpleApi {
    @GET("posts/4")
    suspend fun getPost(): Post //  return a Post, Post is a model class
}