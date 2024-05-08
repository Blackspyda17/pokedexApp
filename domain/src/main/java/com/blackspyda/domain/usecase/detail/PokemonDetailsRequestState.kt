package com.blackspyda.domain.usecase.detail

import com.blackspyda.domain.model.PokemonDetails

//states of the pokemon information
sealed class PokemonDetailsRequestState {
    data object Loading : PokemonDetailsRequestState()
    data class Success(val data: PokemonDetails) : PokemonDetailsRequestState()
    data class Exception(val code: Int = -1, val exception: Throwable) :
        PokemonDetailsRequestState()
}