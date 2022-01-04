package com.example.composeexample.ui.sleep

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexample.ui.multiUsageBlocks.GreetingView
import com.example.composeexample.ui.theme.DeepBlue

@Preview
@Composable
fun SleepScreen() {
    Column(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        GreetingView("Sleep screen!!")
    }
}