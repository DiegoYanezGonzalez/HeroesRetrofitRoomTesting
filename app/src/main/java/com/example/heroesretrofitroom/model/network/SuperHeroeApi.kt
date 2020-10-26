package com.example.heroesretrofitroom.model.network

import com.example.heroesretrofitroom.model.pojos.SuperHeroe
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface SuperHeroeApi {
    //Vieja confiable
    @GET("all.json")
    fun fetchAllSuperHeroes(): Call<List<SuperHeroe>>

    //Coroutines
    @GET("all.json")
    suspend fun fetchAllSuperHeroesWithCoroutines(): Response<List<SuperHeroe>>
}