package com.example.nighteventsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.*
import com.example.nighteventsapp.ui.screens.*
import com.example.nighteventsapp.ui.theme.NightEventsAppTheme
import kotlinx.coroutines.launch
import com.example.nighteventsapp.ui.components.DrawerContent
import com.example.nighteventsapp.ui.components.TopBar
import com.example.nighteventsapp.ui.components.BottomNavigationBar


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            val scope = rememberCoroutineScope()
            val isDarkTheme = remember { mutableStateOf(false) }
            NightEventsAppTheme(darkTheme = isDarkTheme.value) {
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    gesturesEnabled = true,
                    drawerContent = {
                        DrawerContent(navController) {
                        }
                    },
                    content = {Scaffold(
                        topBar = {
                            TopBar(
                                onThemeToggle = { isDarkTheme.value = !isDarkTheme.value },
                                onOpenDrawer = { scope.launch { drawerState.open() } }
                            )
                        },

                        bottomBar = { BottomNavigationBar(navController) }

                    ) { innerPadding ->
                        NavHost(
                            navController = navController,
                            startDestination = "home",
                            modifier = Modifier.padding(innerPadding)

                        ) {
                            composable("home") { HomeScreen(navController, context = LocalContext.current) }
                            composable("events") { SubscribedEventsScreen(navController) }
                            composable("favorites") { FavoritesScreen(navController) }
                            composable("eventDetails/{eventId}") { backStackEntry ->
                                val eventId = backStackEntry.arguments?.getString("eventId")
                                EventDetailsScreen(eventId = eventId)
                            }
                        }
                    }
                    }
                )
            }
        }
    }
}