package com.blackspyda.data.repository.details

import com.blackspyda.data.datasource.details.PokemonDetailsDataSource
import com.blackspyda.domain.model.PokemonDetails
import com.blackspyda.domain.model.resource.ResultState
import com.blackspyda.domain.repository.details.PokemonDetailsRepository
import javax.inject.Inject

class PokemonDetailsRepositoryImpl @Inject constructor(
    private val dataSource: PokemonDetailsDataSource
) : PokemonDetailsRepository {
    override suspend fun getPokemonDetails(name: String): ResultState<PokemonDetails> {
        return dataSource.getPokemonsDetails(name)
    }
}