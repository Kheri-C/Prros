package com.example.prros.service

import com.example.prros.response.PerroResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface PerrosAPIService {
    @GET
    suspend fun getPerrosPorRaza(@Url url: String):
            Response<PerroResponse>
}