package com.example.hw4_nicholasblake
import com.example.hw4_nicholasblake.RetrofitInstance
import com.example.hw4_nicholasblake.Post
class Repository {
    suspend fun getPost():Post {
        return  RetrofitInstance.api.getPost() // call the ref of retrofitinstance and call getPost()
    }
}