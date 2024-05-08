package com.blackspyda.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.blackspyda.common.MainDispatcherRule
import com.blackspyda.domain.usecase.pokemons.GetPokemonsList
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule


@ExperimentalCoroutinesApi
class HomeViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private lateinit var getPokemonsList: GetPokemonsList
    private lateinit var viewModel: HomeViewModel


    @Before
    fun setup() {
        getPokemonsList = mockk()
        viewModel = HomeViewModel(getPokemonsList)
    }

}