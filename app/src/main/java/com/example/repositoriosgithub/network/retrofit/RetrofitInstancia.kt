package com.example.repositoriosgithub.network.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


//instanciar o retrofit
class RetrofitInstancia {
    companion object{
        fun getRetrofitIntance(): Retrofit{
        val url = UrlConstante.URLBASE

            return Retrofit.Builder()
                .baseUrl(UrlConstante.URLBASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}