package com.blackspyda.view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.blackspyda.view.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBarMain(
) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painterResource(R.drawable.pokemon_logo),
                    contentDescription = null,
                    modifier = Modifier.requiredSize(120.dp)
                )
                Image(
                    painterResource(R.drawable.pokedex),
                    contentDescription = null,
                    modifier = Modifier.requiredSize(35.dp)
                )
            }
        },
        
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
        
    )
}