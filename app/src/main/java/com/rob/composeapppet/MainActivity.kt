package com.rob.composeapppet

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rob.composeapppet.ui.App
import com.rob.composeapppet.ui.HomeScreen
import com.rob.composeapppet.ui.OrdersScreen
import com.rob.composeapppet.ui.UsersScreen
import com.rob.composeapppet.ui.theme.ComposeAppPetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home", modifier = Modifier.weight(1f)) {
                    composable("home") { HomeScreen() }
                    composable("orders") { OrdersScreen() }
                    composable("users") { UsersScreen() }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Home", modifier = Modifier.clickable { navController.navigate("home") })
                    Text(text = "Orders", modifier = Modifier.clickable {  navController.navigate("orders") })
                    Text(text = "Users", modifier = Modifier.clickable {  navController.navigate("users") })
                }
            }
        }
    }
}