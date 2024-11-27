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
fun AboutScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center, // Centrera vertikalt
        horizontalAlignment = Alignment.CenterHorizontally, // Centrera horisontellt
        modifier = Modifier
            .fillMaxSize() // Fyll hela skärmen
            .padding(16.dp)
    ) {
        Text("Om Blues Music")
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Blues är en musikgenre som uppstod i Deep South i USA " +
                    "runt 1860-talet. Den kännetecknas av blue notes, call-and-response " +
                    "och specifika ackordprogressioner."
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Knapp för att gå tillbaka
        Button(onClick = { navController.popBackStack() }) {
            Text("Tillbaka")
        }
    }
}
