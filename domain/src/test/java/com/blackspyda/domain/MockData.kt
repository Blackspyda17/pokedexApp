package com.blackspyda.domain

import com.blackspyda.domain.model.PokemonDetails


object MockData {

    val mockPokoemonDetails = PokemonDetails(
        id = 21,
        name = "pikachu",
        height = 3,
        weight = 20,
        baseExperience = 52,
        order = 30,
        stats = emptyList(),
    )

    val exception = Throwable()
}