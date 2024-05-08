package com.blackspyda.domain.usecase.detail

import kotlinx.coroutines.flow.Flow

//interface to handle pokemon details
interface GetPokemonDetailsUseCase {
    suspend fun invoke(name: String): Flow<PokemonDetailsRequestState>
}