package com.blackspyda.data.response

import com.blackspyda.data.entity.PokemonEntity
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonsResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonEntity>,
)