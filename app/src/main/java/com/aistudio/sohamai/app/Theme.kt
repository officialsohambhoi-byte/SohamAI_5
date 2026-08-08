package com.aistudio.sohamai.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF111111),
    onPrimary = Color.White,
    secondary = Color(0xFF555555),
    background = Color(0xFFF8F8F8),
    surface = Color.White
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFF2F2F2),
    onPrimary = Color(0xFF111111),
    secondary = Color(0xFFBDBDBD),
    background = Color(0xFF0D0D0D),
    surface = Color(0xFF171717)
)

@Composable
fun SohamAITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
