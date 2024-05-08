package com.blackspyda.pokedex

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.blackspyda.details.navigation.detailsScreen
import com.blackspyda.details.navigation.navigateToDetails
import com.blackspyda.home.navigation.HOME_ROUTE
import com.blackspyda.home.navigation.homeScreen

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(
        modifier = Modifier.fillMaxSize(),
        navController = navController,
        startDestination = HOME_ROUTE
    ) {
        homeScreen { itemName ->
            navController.navigateToDetails(itemName)
        }
        detailsScreen(onNavigateUp = {
            navController.navigateUp()
        })
    }
}