package com.blackspyda.data.datasource.details

import com.blackspyda.domain.model.PokemonDetails
import com.blackspyda.domain.model.resource.ResultState

interface PokemonDetailsDataSource {
    suspend fun getPokemonsDetails(name: String): ResultState<PokemonDetails>
}