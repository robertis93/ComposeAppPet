package com.rob.composeapppet.ui

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ClickCounter(
    uppercase: Boolean,
    counterValue: Int,
    onCounterClick: () -> Unit,
    onCheckedChange: (Boolean) -> Unit
) {
    val evenOdd = remember(uppercase) { EvenOdd(uppercase) }
    Column() {
        Text(
            text = "Clicks: $counterValue ${evenOdd.check(counterValue)}",
            modifier = Modifier.clickable(onClick = onCounterClick)
        )
        Row(verticalAlignment = CenterVertically) {
            Checkbox(checked = uppercase, onCheckedChange = onCheckedChange)
            Text(
                "UpperCase",
                fontSize = 18.sp,
                modifier = Modifier.clickable() { onCheckedChange(!uppercase) })
        }
        Log.d(TAG, "ClickCounter(counter = $counterValue, uppercase = $uppercase), $evenOdd")
    }


}

class EvenOdd(private val uppercase: Boolean) {
    fun check(value: Int): String {
        var result = if (value % 2 == 0) "even" else "odd"
        if (uppercase) result = result.uppercase()
        return result
    }

    override fun toString(): String {
        return "EvenOdd(uppercase = $uppercase, hashcode = ${hashCode()})"
    }
}