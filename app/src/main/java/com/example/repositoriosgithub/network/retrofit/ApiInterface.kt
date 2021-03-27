package com.example.repositoriosgithub.network.retrofit

import com.example.repositoriosgithub.model.ItemsModel
import retrofit2.Call
import retrofit2.http.GET

/*
*função que recebe a lista de todos os repositorios publicos
*/

interface ApiInterface {

    @GET("repositories")
    fun apiGetRepositorios(): Call<List<ItemsModel>>
}