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
fun LoggedInScreen(navController: NavController, userName: String?) {
    Column(
        verticalArrangement = Arrangement.Center, // Centrera innehållet vertikalt
        horizontalAlignment = Alignment.CenterHorizontally, // Centrera innehållet horisontellt
        modifier = Modifier
            .fillMaxSize() // Fyll hela skärmen
            .padding(16.dp)
    ) {
        Text("Välkommen, $userName!")
        Spacer(modifier = Modifier.height(10.dp))
        Text("Utforska bluesmusiken!")
        Spacer(modifier = Modifier.height(20.dp))

        // Logga ut samt gå tillbaka
        Button(onClick = { navController.popBackStack() }) {
            Text("Logga ut")
        }
    }
}
