package com.blackspyda.domain.repository.details

import com.blackspyda.domain.model.PokemonDetails
import com.blackspyda.domain.model.resource.ResultState

interface PokemonDetailsRepository {
    suspend fun getPokemonDetails(name: String): ResultState<PokemonDetails>
}