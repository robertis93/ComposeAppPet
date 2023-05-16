package com.rob.composeapppet.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    checked: State<Boolean>,
    onCheckedChange: (Boolean) -> Unit
) {
    val checkedValue = checked.value
    Row(verticalAlignment = CenterVertically) {
        Checkbox(checked = checkedValue, onCheckedChange = onCheckedChange)
        Text("Some checkbox text",  fontSize = 18.sp,  modifier = Modifier.clickable() { onCheckedChange(!checkedValue)})
        OutlinedTextField(value = "привет", onValueChange = {})

    }
}

//    Text(
//        text = "Home screen",
//        fontSize = 32.sp,
//        color = Color.White,
//        maxLines = 1,
//        overflow = TextOverflow.Ellipsis,
//        textAlign = TextAlign.Center,
//        modifier = Modifier
//            .background(color = Color.Black)
//            .fillMaxWidth()
//    )
//    AsyncImage(
//        model = "https://developer.android.com/images/android-go/next-billion-users_856.png",
//        contentDescription = null
//    )

//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen()
//}