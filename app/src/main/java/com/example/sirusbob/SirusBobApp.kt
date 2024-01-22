package com.example.sirusbob

import androidx.annotation.StringRes
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sirusbob.R

enum class Screens(@StringRes val title: Int) {
    MAINSCREEN(title = R.string.app_namee)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SirusBobAppBar(
    currentScreen: Screens
) {
TopAppBar(title = { currentScreen.title} )
}

@Composable
fun SirusBobApp() {
    val navController: NavHostController = rememberNavController()


}
