package com.blackspyda.domain.repository.pokemons

import androidx.paging.PagingData
import com.blackspyda.domain.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface PokemonsListRepository {
    suspend fun getPokemonsList(): Flow<PagingData<Pokemon>>
}