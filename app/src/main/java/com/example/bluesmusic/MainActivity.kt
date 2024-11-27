package com.example.bluesmusic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bluesmusic.ui.theme.BluesmusicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Tar bort statusfältets kant för ett bättre UI

        setContent {
            BluesmusicTheme { // Använder appens tema
                Scaffold(
                    modifier = Modifier.fillMaxSize() // Fyller hela skärmen
                ) { innerPadding ->
                    // Surface används som bakgrundsyta med appens tema
                    Surface(
                        modifier = Modifier.padding(innerPadding), // Tar hänsyn till safe areas
                        color = MaterialTheme.colorScheme.background // Sätter bakgrundsfärgen
                    ) {
                        BluesAppNavHost() // Startar appens navigeringssystem
                    }
                }
            }
        }
    }
}
