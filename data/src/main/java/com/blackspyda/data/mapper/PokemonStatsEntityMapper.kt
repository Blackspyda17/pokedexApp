package com.blackspyda.data.mapper

import com.blackspyda.data.entity.PokemonStatsEntity
import com.blackspyda.data.entity.StatEntity
import com.blackspyda.domain.model.PokemonStats
import com.blackspyda.domain.model.Stat

object PokemonStatsEntityMapper : Mapper<PokemonStatsEntity, PokemonStats> {
    override fun map(data: PokemonStatsEntity): PokemonStats {
        return PokemonStats(
            baseStat = data.baseStat,
            effort = data.effort,
            stat = StatEntityMapper.map(data.stat)
        )
    }
}

object StatEntityMapper : Mapper<StatEntity, Stat> {
    override fun map(data: StatEntity): Stat {
        return Stat(
            name = data.name,
            url = data.url
        )
    }
}