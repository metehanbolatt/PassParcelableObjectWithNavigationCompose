package com.metehanbolat.passparcelableobjectwithnavigationcompose.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.metehanbolat.passparcelableobjectwithnavigationcompose.Person
import com.metehanbolat.passparcelableobjectwithnavigationcompose.screen.details.DetailsScreen
import com.metehanbolat.passparcelableobjectwithnavigationcompose.screen.home.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Details.route) {
            LaunchedEffect(key1 = it) {
                val result = navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
                Log.d("DetailsScreen", "${result?.firstName}")
                Log.d("DetailsScreen", "${result?.lastName}")
            }
            DetailsScreen(navController = navController)
        }
    }
}