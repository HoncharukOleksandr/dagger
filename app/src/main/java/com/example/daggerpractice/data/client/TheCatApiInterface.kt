package com.example.daggerpractice.data.client

import com.example.daggerpractice.data.pojo_models.image.ImageResponce
import retrofit2.http.GET

interface TheCatApiInterface {

    @GET("?mime_types=jpg,png/?x-api-key=7be1b8a3-8585-4ac9-ac63-e1a213ade98a?&limit=20")
    suspend fun getCatsImage(): List<ImageResponce>
}