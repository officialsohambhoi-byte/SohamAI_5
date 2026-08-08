package com.aistudio.sohamai.app.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

private object Routes {
    const val HOME = "home"
    const val CHAT = "chat"
    const val STUDY = "study"
    const val WORKSPACE = "workspace"
    const val SETTINGS = "settings"
}

@Composable
fun SohamAINavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            HomeScreen(
                onNewChat = { navController.navigate(Routes.CHAT) },
                onStudy = { navController.navigate(Routes.STUDY) },
                onWorkspace = { navController.navigate(Routes.WORKSPACE) },
                onSettings = { navController.navigate(Routes.SETTINGS) }
            )
        }
        composable(Routes.CHAT) {
            ChatScreen(onBack = { navController.popBackStack() })
        }
        composable(Routes.STUDY) {
            StudyScreen(onBack = { navController.popBackStack() })
        }
        composable(Routes.WORKSPACE) {
            WorkspaceScreen(onBack = { navController.popBackStack() })
        }
        composable(Routes.SETTINGS) {
            SettingsScreen(onBack = { navController.popBackStack() })
        }
    }
}
