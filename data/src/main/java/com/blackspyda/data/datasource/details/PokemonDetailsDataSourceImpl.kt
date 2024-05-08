package com.blackspyda.data.datasource.details

import com.blackspyda.data.api.PokemonDetailsApi
import com.blackspyda.data.mapper.PokemonDetailsMapper
import com.blackspyda.data.response.handleApiReponse
import com.blackspyda.domain.model.PokemonDetails
import com.blackspyda.domain.model.resource.ResultState
import javax.inject.Inject

class PokemonDetailsDataSourceImpl @Inject constructor(
    private val api: PokemonDetailsApi
) : PokemonDetailsDataSource {
    override suspend fun getPokemonsDetails(name: String): ResultState<PokemonDetails> {
        return handleApiReponse(mapper = PokemonDetailsMapper) {
            api.getPokemonDetails(name)
        }
    }
}