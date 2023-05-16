package com.rob.composeapppet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rob.composeapppet.ui.HomeScreen
import com.rob.composeapppet.ui.theme.ComposeAppPetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val checked = mutableStateOf(true)
        setContent {
            HomeScreen(
                checked = checked,
                onCheckedChange = { newCheckedValue ->
                    checked.value = newCheckedValue
                }
            )
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppPetTheme {
        Greeting("Android")
    }
}