package com.example.p10

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeService {
    @GET("/anime")
    fun getAnime(): Call<KitsuAnime>
}
