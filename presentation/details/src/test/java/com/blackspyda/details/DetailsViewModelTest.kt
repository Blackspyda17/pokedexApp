package com.blackspyda.details

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import app.cash.turbine.test
import com.blackspyda.common.MainDispatcherRule
import com.blackspyda.details.MockData.mockPokemonDetails
import com.blackspyda.details.intent.DetailsIntent
import com.blackspyda.domain.usecase.detail.GetPokemonDetails
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import io.mockk.just
import io.mockk.runs
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.assertj.core.api.Assertions
import org.junit.Before
import org.junit.Rule
import org.junit.Test


// test for the view-model of the details section
@OptIn(ExperimentalCoroutinesApi::class)
class DetailsViewModelTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    @MockK
    private lateinit var getPokemonDetails: GetPokemonDetails
    private lateinit var viewModel: DetailsViewModel

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        viewModel = DetailsViewModel(getPokemonDetails)
    }

    @Test
    fun shouldHaveIdleState() = runTest {
        viewModel.pokemonDetailsState.test {
            val item = awaitItem()
            Assertions.assertThat(item).isEqualTo(DetailsUiState.Idle)
        }
    }


    @Test
    fun shouldGetPokemonDetails() = runTest {
        val expectedPokemonDetails = mockPokemonDetails()
        coEvery { viewModel.processIntent(DetailsIntent.GetDetails(any())) } just runs

        viewModel.processIntent(DetailsIntent.GetDetails(expectedPokemonDetails.data.name))
        advanceUntilIdle()

        viewModel.pokemonDetailsState.test {
            val received = awaitItem()
            Assertions.assertThat(received).isEqualTo(expectedPokemonDetails)
            awaitComplete()
        }
    }
}