package com.example.ricknmorty.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://rickandmortyapi.com/api/"

var retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(ScalarsConverterFactory.create())
    .build()

interface CharactersApiServiceInterface {
    @GET("character")
    fun getCharacters(): Call<String>
}

object CharacterApi{
    val retrofitService: CharactersApiServiceInterface by lazy {
        retrofit.create(CharactersApiServiceInterface::class.java)
    }
}