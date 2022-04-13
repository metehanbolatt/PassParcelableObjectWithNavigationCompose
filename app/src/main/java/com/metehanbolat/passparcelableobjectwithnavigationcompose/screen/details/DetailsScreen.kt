package com.metehanbolat.passparcelableobjectwithnavigationcompose.screen.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.metehanbolat.passparcelableobjectwithnavigationcompose.SharedViewModel

@Composable
fun DetailsScreen(
    navController: NavHostController
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable {
            navController.popBackStack()
        },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Details",
            style = TextStyle(
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        )
    }

}