package com.rob.composeapppet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import com.rob.composeapppet.ui.ClickCounter
import com.rob.composeapppet.ui.theme.ComposeAppPetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val upperCase = mutableStateOf(true)
        val counter = mutableStateOf(0)
        setContent {
            ClickCounter(
                uppercase = upperCase.value,
                counterValue = counter.value,
                onCounterClick = { counter.value++ },
                onCheckedChange = { newCheckedValue ->
                    upperCase.value = newCheckedValue
                })
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