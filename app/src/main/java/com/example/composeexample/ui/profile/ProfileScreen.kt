package com.example.composeexample.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample.ui.multiUsageBlocks.TitleView
import com.example.composeexample.ui.theme.DeepBlue

@Preview
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        TitleView(title = "Profile screen!!")
    }
}