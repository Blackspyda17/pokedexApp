package com.blackspyda.data.api

import com.blackspyda.data.entity.PokemonDetailsEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonDetailsApi {

    @GET("pokemon/{name}")
    suspend fun getPokemonDetails(
        @Path("name") name: String
    ): Response<PokemonDetailsEntity>
}