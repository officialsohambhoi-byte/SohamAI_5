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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkspaceScreen(onBack: () -> Unit) {
    val items = listOf("Chats", "Documents", "Notes", "Projects", "Study Materials")
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Workspace") },
                navigationIcon = { IconButton(onClick = onBack) { Text("‹") } }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(items) { item ->
                ListItem(
                    headlineContent = { Text(item) },
                    supportingContent = { Text("Workspace storage and ownership rules will be enforced by the backend.") }
                )
            }
        }
    }
}
