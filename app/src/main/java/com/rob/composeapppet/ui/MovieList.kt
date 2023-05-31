package com.rob.composeapppet.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.White)
    .padding(10.dp)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MovieListScreen(
    movieListViewModel: MovieListViewModel = viewModel(),
    onCounterClick: (String) -> Unit
) {
    LazyColumn(modifier = listModifier) {
        val movies = movieListViewModel.filmList
        items(movies) { country ->
            Text(
                text = country,
                modifier = Modifier
                    .clickable(onClick = { onCounterClick(country) })
                    .padding(20.dp)
                    .border(
                        width = 2.dp,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color.Red,
                                Color.Yellow,
                                Color.Green
                            )
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ),
                style = TextStyle(fontSize = 40.sp, color = Color.Black)
            )
        }
    }
}