package com.example.repositoriosgithub.network.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInstancia {
    companion object{
        fun getRetrofitIntance(): Retrofit{
        val url = UrlConstante.urlBase

            return Retrofit.Builder()
                .baseUrl(UrlConstante.urlBase)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}