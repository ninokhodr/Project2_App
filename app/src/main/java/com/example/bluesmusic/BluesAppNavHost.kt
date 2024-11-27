package com.example.bluesmusic

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.bluesmusic.screens.*

@Composable
fun BluesAppNavHost() {
    val navController = rememberNavController() // Skapar navController för att styra navigeringen

    NavHost(
        navController = navController, // Kopplar navigeringsflödet till navController
        startDestination = "welcome" // Startskärmen är WelcomeScreen
    ) {
        // Skärm: Välkomstsidan
        composable("welcome") {
            WelcomeScreen(navController) // Går till WelcomeScreen
        }

        // Skärm: Om Blues
        composable("about") {
            AboutScreen(navController) // Går till AboutScreen
        }

        // Skärm: Logga in
        composable("signin") {
            SignInScreen(navController) // Går till SignInScreen
        }

        // Skärm: Inloggad vy med användarnamn som parameter
        composable(
            "loggedin/{userName}", // Dynamisk skärm med användarnamnet som parameter
            arguments = listOf(navArgument("userName") { type = NavType.StringType }) // Definierar att användarnamnet är en sträng
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName") // Hämtar användarnamnet från navigeringsargumenten
            LoggedInScreen(navController, userName) // Navigerar till LoggedInScreen och skickar användarnamnet
        }
    }
}
