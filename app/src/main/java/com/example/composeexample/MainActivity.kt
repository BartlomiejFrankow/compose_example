package com.example.composeexample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composeexample.ui.home.HomeView
import com.example.composeexample.ui.menu.BottomMenuType
import com.example.composeexample.ui.menu.BottomMenuType.*
import com.example.composeexample.ui.menu.BottomMenuView
import com.example.composeexample.ui.theme.ComposeExampleTheme
import com.example.composeexample.ui.theme.DeepBlue

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExampleTheme {
                Box(
                    modifier = Modifier
                        .background(DeepBlue)
                        .fillMaxSize()
                ) {
                    HomeView()
                    BottomMenuView(
                        modifier = Modifier.align(Alignment.BottomCenter),
                        onItemClick = { navigateTo(it) }
                    )
                }
            }
        }
    }

    private fun navigateTo(menuItem: BottomMenuType) {
        when (menuItem) {
            Home -> Toast.makeText(applicationContext, menuItem.title, Toast.LENGTH_LONG).show()
            Meditate -> Toast.makeText(applicationContext, menuItem.title, Toast.LENGTH_LONG).show()
            Sleep -> Toast.makeText(applicationContext, menuItem.title, Toast.LENGTH_LONG).show()
            Music -> Toast.makeText(applicationContext, menuItem.title, Toast.LENGTH_LONG).show()
            Profile -> Toast.makeText(applicationContext, menuItem.title, Toast.LENGTH_LONG).show()
        }
    }
}
