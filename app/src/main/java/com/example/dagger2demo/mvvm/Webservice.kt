package com.example.dagger2demo.mvvm
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Deferred
import retrofit.http.GET
import retrofit.http.Path
import retrofit2.Call

interface Webservice {
    @GET("/todos/{id}")
    fun getTodo(@Path(value = "id") todoId: Int): Call<Todo>
}