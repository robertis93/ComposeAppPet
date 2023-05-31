package com.rob.composeapppet.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MovieInfoScreen(movieName: String, movieListViewModel: MovieListViewModel = viewModel()) {
    Text(
        text = movieName,
        modifier = Modifier.padding(40.dp),
        style = TextStyle(fontSize = 30.sp, color = Color.Green)
    )
}