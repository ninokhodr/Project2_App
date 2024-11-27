package com.example.bluesmusic.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center, // Komponenter centreras vertikalt
        horizontalAlignment = Alignment.CenterHorizontally, // Komponenter centreras horisontellt
        modifier = Modifier.fillMaxSize() // Tar upp hela skärmens utrymme
    ) {
        Text("Välkommen till Blues Music-appen")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("about") }) {
            Text("Lär dig om Blues") // Går till "AboutScreen"
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate("signin") }) {
            Text("Logga in") // Går till "SignInScreen"
        }
    }
}
