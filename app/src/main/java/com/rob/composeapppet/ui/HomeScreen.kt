package com.rob.composeapppet.ui

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.TextButton
import androidx.compose.runtime.mutableStateListOf

@Composable
fun HomeScreen() {
    Log.d(TAG, "HomeScreen")
    val list = remember {
        mutableStateListOf("Item 1", "Item 2", "Item 3")
    }
    Column {
        TextButton(onClick = {
            Log.d(TAG, "--- append ---" + "zzzz" + list.size.toString())
            list.add("Item ${list.size + 1}")
        }) {
            Text(text = "Append")
        }
        list.forEach { value ->
            SomeItem(value)
        }
    }
}

@Composable
fun SomeItem(text: String) {
    Log.d(TAG, "SomeItem $text")
    Text(
        text = text, fontSize = 20.sp,
        modifier = Modifier.padding(16.dp)
    )
}