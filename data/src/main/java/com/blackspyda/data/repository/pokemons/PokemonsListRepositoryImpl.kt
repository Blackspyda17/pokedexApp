package com.blackspyda.data.repository.pokemons

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.blackspyda.data.datasource.pokemons.PAGING_LIMIT
import com.blackspyda.data.repository.pokemons.paging.PokemonsListPagingSource
import com.blackspyda.domain.model.Pokemon
import com.blackspyda.domain.repository.pokemons.PokemonsListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

private const val PREFETCH_DISTANCE = 5

class PokemonsListRepositoryImpl @Inject constructor(
    private val pokemonsListPagingSource: PokemonsListPagingSource
) : PokemonsListRepository {

    override suspend fun getPokemonsList(): Flow<PagingData<Pokemon>> {
        return Pager(
            config = PagingConfig(pageSize = PAGING_LIMIT, prefetchDistance = PREFETCH_DISTANCE),
            pagingSourceFactory = {
                pokemonsListPagingSource
            }
        ).flow
    }
}