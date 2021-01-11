package com.example.dagger2demo.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class MainViewModel : ViewModel() {
    val repository: TodoRepository = TodoRepository()

    fun getFirstTodo(): LiveData<Todo> {
        return repository.getTodo(1)
    }
}