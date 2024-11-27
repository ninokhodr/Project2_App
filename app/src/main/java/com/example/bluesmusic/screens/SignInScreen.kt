package com.example.bluesmusic.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bluesmusic.R

val validUsersArray = arrayOf("Nino", "Rudie", "STI") // Våra giltiga användare

@Composable
fun SignInScreen(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }
    var showMoreInfo by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        // Logotyp
        Image(
            painter = painterResource(id = R.drawable.stratocaster),
            contentDescription = "Blues Music Logo",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text("Logga in")
        Spacer(modifier = Modifier.height(10.dp))

        // Textfält för inloggning
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Ange ditt namn") },
            singleLine = true,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Logga in knapp
        Button(onClick = {
            if (name.lowercase() in validUsersArray.map { it.lowercase() }) {
                navController.navigate("loggedin/$name")
            } else {
                errorMessage = "Användaren hittades inte!"
            }
        }) {
            Text("Logga in")
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Felmeddelande
        if (errorMessage.isNotEmpty()) {
            Text(errorMessage, color = androidx.compose.material3.MaterialTheme.colorScheme.error)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { showMoreInfo = !showMoreInfo }) {
            Text(if (showMoreInfo) "Dölj Info" else "Mer Info")
        }

        if (showMoreInfo) {
            Text(
                text = "Bluesmusiken har sitt ursprung i Deep South och har påverkat många musik genrer.",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
