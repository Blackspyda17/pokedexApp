package com.blackspyda.data.di

import com.blackspyda.data.datasource.details.PokemonDetailsDataSource
import com.blackspyda.data.datasource.details.PokemonDetailsDataSourceImpl
import com.blackspyda.data.datasource.pokemons.PokemonsListDataSource
import com.blackspyda.data.datasource.pokemons.PokemonsListDataSourceImpl
import com.blackspyda.data.repository.details.PokemonDetailsRepositoryImpl
import com.blackspyda.data.repository.pokemons.PokemonsListRepositoryImpl
import com.blackspyda.domain.repository.details.PokemonDetailsRepository
import com.blackspyda.domain.repository.pokemons.PokemonsListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindsPokemonsListDataSource(pokemonsListDataSource: PokemonsListDataSourceImpl)
            : PokemonsListDataSource

    @Binds
    abstract fun bindsPokemonsListRepository(pokemonsListRepository: PokemonsListRepositoryImpl)
            : PokemonsListRepository


    @Binds
    abstract fun bindsPokemonDetailsDataSource(pokemonDetailsDataSource: PokemonDetailsDataSourceImpl)
            : PokemonDetailsDataSource

    @Binds
    abstract fun bindsPokemonDetailsRepository(pokemonDetailsRepository: PokemonDetailsRepositoryImpl)
            : PokemonDetailsRepository
}