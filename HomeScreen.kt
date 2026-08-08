package com.aistudio.sohamai.app.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNewChat: () -> Unit,
    onStudy: () -> Unit,
    onWorkspace: () -> Unit,
    onSettings: () -> Unit
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("SohamAI") }) },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(selected = true, onClick = {}, icon = { Text("⌂") }, label = { Text("Home") })
                NavigationBarItem(selected = false, onClick = onStudy, icon = { Text("▣") }, label = { Text("Study") })
                NavigationBarItem(selected = false, onClick = onWorkspace, icon = { Text("□") }, label = { Text("Workspace") })
                NavigationBarItem(selected = false, onClick = onSettings, icon = { Text("⚙") }, label = { Text("Settings") })
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding),
            contentPadding = PaddingValues(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text("What can I help you with?", style = MaterialTheme.typography.headlineMedium)
                Spacer(Modifier.height(6.dp))
                Text("A clean foundation for your own AI assistant.", style = MaterialTheme.typography.bodyLarge)
            }
            item {
                Button(
                    onClick = onNewChat,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp)
                ) { Text("Start a new chat") }
            }
            item {
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    ActionCard("Study Mode", onStudy, Modifier.weight(1f))
                    ActionCard("Workspace", onWorkspace, Modifier.weight(1f))
                }
            }
            item {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(18.dp)) {
                        Text("Recent conversations", style = MaterialTheme.typography.titleLarge)
                        Spacer(Modifier.height(8.dp))
                        Text("No conversations yet.")
                        TextButton(onClick = onNewChat) { Text("Create your first chat") }
                    }
                }
            }
        }
    }
}

@Composable
private fun ActionCard(title: String, onClick: () -> Unit, modifier: Modifier) {
    Card(modifier = modifier) {
        Column(Modifier.padding(16.dp)) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.height(10.dp))
            TextButton(onClick = onClick) { Text("Open") }
        }
    }
}
