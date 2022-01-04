package com.example.composeexample.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composeexample.R
import com.example.composeexample.ui.home.HomeScreen
import com.example.composeexample.ui.meditate.MeditateScreen
import com.example.composeexample.ui.music.MusicScreen
import com.example.composeexample.ui.profile.ProfileScreen
import com.example.composeexample.ui.sleep.SleepScreen

@ExperimentalFoundationApi
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) { HomeScreen() }
        composable(route = BottomBarScreen.Meditate.route) { MeditateScreen() }
        composable(route = BottomBarScreen.Sleep.route) { SleepScreen() }
        composable(route = BottomBarScreen.Music.route) { MusicScreen() }
        composable(route = BottomBarScreen.Profile.route) { ProfileScreen() }
    }
}

sealed class BottomBarScreen(val route: String, val title: Int, @DrawableRes val iconId: Int) {
    object Home : BottomBarScreen("Home", R.string.home, R.drawable.ic_home)
    object Meditate : BottomBarScreen("Meditate", R.string.meditate, R.drawable.ic_bubble)
    object Sleep : BottomBarScreen("Sleep", R.string.sleep, R.drawable.ic_moon)
    object Music : BottomBarScreen("Music", R.string.music, R.drawable.ic_music)
    object Profile : BottomBarScreen("Profile", R.string.profile, R.drawable.ic_profile)
}
