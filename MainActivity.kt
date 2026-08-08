package com.aistudio.sohamai.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.aistudio.sohamai.app.ui.SohamAIApp
import com.aistudio.sohamai.app.ui.theme.SohamAITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SohamAITheme {
                SohamAIApp()
            }
        }
    }
}
