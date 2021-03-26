package com.example.repositoriosgithub.UI.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.repositoriosgithub.model.ItemsModel
import com.example.repositoriosgithub.network.retrofit.ApiInterface
import com.example.repositoriosgithub.network.retrofit.RetrofitInstancia
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GitViewModel(application: Application): AndroidViewModel(application) {
    lateinit var mutableListLiveData: MutableLiveData<List<ItemsModel>>

    init {
        mutableListLiveData = MutableLiveData()
    }

    //retorna a variavel para observar
    fun getMutableList(): MutableLiveData<List<ItemsModel>>{
        return mutableListLiveData
    }

    //faz a call para a api rest
    fun getRepositorio(){
        val retrofitInstancia = RetrofitInstancia.getRetrofitIntance().create(ApiInterface::class.java)
        val call = retrofitInstancia.apiGetRepositorios()
        call.enqueue(object : Callback<List<ItemsModel>>{
            override fun onFailure(call: Call<List<ItemsModel>>, t: Throwable) {
            }

            override fun onResponse(call: Call<List<ItemsModel>>, response: Response<List<ItemsModel>>) {
                mutableListLiveData.postValue(response.body())

            }

        })

    }

}