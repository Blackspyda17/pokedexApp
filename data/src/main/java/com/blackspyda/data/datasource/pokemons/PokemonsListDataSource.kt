package com.blackspyda.data.datasource.pokemons

import com.blackspyda.data.response.PokemonsResponse

interface PokemonsListDataSource {
    suspend fun getPokemonsList(page: Int): PokemonsResponse
}