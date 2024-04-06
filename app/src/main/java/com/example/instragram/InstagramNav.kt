package com.example.instragram

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.instragram.screen.HomeScreen
import com.example.instragram.screen.NotificationScreen
import com.example.instragram.screen.ProfileScreen
import com.example.instragram.screen.ReelsScreen
import com.example.instragram.screen.SearchScreen

@Composable
fun InstagramNavBar(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = BottomNavRoute.HOME.route){
        composable(route = BottomNavRoute.HOME.route){
            HomeScreen()
        }
        composable(route = BottomNavRoute.SEARCH.route){
            SearchScreen()
        }
        composable(route = BottomNavRoute.REEL.route){
            ReelsScreen()
        }
        composable(route = BottomNavRoute.NOTIFICATION.route){
            NotificationScreen()
        }
        composable(route = BottomNavRoute.PROFILE.route){
            ProfileScreen()
        }
    }
}