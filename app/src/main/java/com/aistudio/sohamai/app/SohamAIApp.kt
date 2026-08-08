package com.aistudio.sohamai.app.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

@Composable
fun SohamAIApp() {
    val navController = rememberNavController()
    Surface(modifier = Modifier.fillMaxSize()) {
        SohamAINavHost(navController)
    }
}
