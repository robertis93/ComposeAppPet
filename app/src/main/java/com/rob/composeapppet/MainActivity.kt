package com.rob.composeapppet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rob.composeapppet.ui.MovieInfoScreen
import com.rob.composeapppet.ui.MovieListScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "movieList",
                    modifier = Modifier.weight(1f)
                ) {
                    composable("movieList") {
                        MovieListScreen(onCounterClick = {
                            navController.navigate(
                                "movieInfo $it"
                            )
                        })
                    }
                    composable(
                        "movieInfo {nameFilm}",
                        arguments = listOf(navArgument("nameFilm") { type = NavType.StringType })
                    ) {
                        val nameFilm = it.arguments?.getString("nameFilm")
                        if (nameFilm != null) {
                            MovieInfoScreen(nameFilm)
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
//                    Text(text = "Home", modifier = Modifier.clickable { navController.navigate("home") })
//                    Text(text = "Orders", modifier = Modifier.clickable {  navController.navigate("orders") })
//                    Text(text = "Users", modifier = Modifier.clickable {  navController.navigate("users") })
                }
            }
        }
    }
}