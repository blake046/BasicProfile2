package com.example.hw4_nicholasblake
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hw4_nicholasblake.Repository
class MainViewModelFactory(private val respository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(respository) as T // return mainViewModel and pass repository
    }
}