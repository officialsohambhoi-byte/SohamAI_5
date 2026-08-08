package com.aistudio.sohamai.app.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.IconButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudyScreen(onBack: () -> Unit) {
    val tools = listOf(
        "Doubt Solver",
        "Quiz Generator",
        "Notes Summarizer",
        "Flashcards",
        "Revision Mode",
        "Study Planner"
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Study Mode") },
                navigationIcon = { IconButton(onClick = onBack) { Text("‹") } }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Text(
                    "Study tools",
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
            items(tools) { tool ->
                ListItem(
                    headlineContent = { Text(tool) },
                    supportingContent = { Text("Backend-powered feature will be connected in the AI service layer.") }
                )
            }
        }
    }
}
