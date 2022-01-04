package com.example.composeexample.ui.multiUsageBlocks

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composeexample.R

@Composable
fun GreetingView(name: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "Good Morning, $name",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = stringResource(R.string.good_day_wish),
                style = MaterialTheme.typography.body1
            )
        }

        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = stringResource(R.string.cd_search),
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}