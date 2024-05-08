package com.blackspyda.data.mapper

import com.blackspyda.data.entity.PokemonEntity
import com.blackspyda.domain.model.Pokemon

object PokemonEntityMapper : Mapper<PokemonEntity, Pokemon> {
    override fun map(data: PokemonEntity): Pokemon = Pokemon(
        name = data.name,
        url = data.url
    )
}