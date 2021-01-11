package com.example.dagger2demo.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TodoRepository {
    var client: Webservice = RetrofitClient.webservice

    fun getTodo(id: Int): LiveData<Todo> {
        val liveData = MutableLiveData<Todo>()

        client.getTodo(id).enqueue(object: Callback<Todo>{
            override fun onResponse(call: Call<Todo>, response: Response<Todo>) {
                if (response.isSuccessful) {

                    // When data is available, populate LiveData
                    liveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<Todo>, t: Throwable) {
                t.printStackTrace()
            }
        })

        // Synchronously return LiveData
        // Its value will be available onResponse
        return liveData
    }
}