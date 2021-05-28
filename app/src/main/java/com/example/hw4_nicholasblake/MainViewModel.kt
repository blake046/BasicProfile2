package com.example.hw4_nicholasblake
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hw4_nicholasblake.Repository
import com.example.hw4_nicholasblake.Post
import kotlinx.coroutines.launch
class MainViewModel (private val repository: Repository):ViewModel(){
    val myResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost(){ // call viewModelScope to launch coroutine
        viewModelScope.launch {
            val response: Post = repository.getPost()
            myResponse.value = response // save the response into myResponse where can use in main
        }
    }
}