package com.blackspyda.home.intent

sealed class HomeIntent {
    data object GetPokemonsList : HomeIntent()
}