package com.blackspyda.domain.usecase.pokemons

import androidx.paging.PagingData
import com.blackspyda.domain.model.Pokemon
import com.blackspyda.domain.repository.pokemons.PokemonsListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

//constructor to get the list of the pokemons
class GetPokemonsList @Inject constructor(
    private val pokempnsListRepository: PokemonsListRepository
) : GetPokemonsListUseCase {
    override suspend fun invoke(): Flow<PagingData<Pokemon>> {
        return pokempnsListRepository.getPokemonsList()
    }
}