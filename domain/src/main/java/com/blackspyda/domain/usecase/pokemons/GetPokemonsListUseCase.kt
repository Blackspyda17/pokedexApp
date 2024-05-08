package com.blackspyda.domain.usecase.pokemons

import androidx.paging.PagingData
import com.blackspyda.domain.model.Pokemon
import kotlinx.coroutines.flow.Flow

// interface to get pokemon list information
interface GetPokemonsListUseCase {
    suspend fun invoke(): Flow<PagingData<Pokemon>>
}