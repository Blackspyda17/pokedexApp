package com.blackspyda.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.blackspyda.home.HomeScreen

const val HOME_ROUTE = "home"
fun NavGraphBuilder.homeScreen(
    onHomeItemSelected: (String) -> Unit
) {
    composable(HOME_ROUTE) {
        HomeScreen(onHomeItemSelected = onHomeItemSelected)
    }
}