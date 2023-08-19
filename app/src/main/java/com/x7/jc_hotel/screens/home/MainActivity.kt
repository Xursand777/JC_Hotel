package com.x7.jc_hotel.screens.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.x7.jc_hotel.screens.home.bottomscreens.bottombarScreen
import com.x7.jc_hotel.screens.splash.ui.theme.AppColor
import com.x7.jc_hotel.utilits.statusbarcolorchange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            statusbarcolorchange(window = window,color = AppColor)
            homescreenmain()
        }
    }
}

@Preview
@Composable
fun homescreenmain () {
    Column(modifier = Modifier.fillMaxSize()) {
        Card(elevation = CardDefaults.cardElevation(2.dp)){
            bottombarScreen()
        }

    }
}

