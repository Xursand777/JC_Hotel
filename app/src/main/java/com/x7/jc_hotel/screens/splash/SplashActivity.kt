package com.x7.jc_hotel.screens.splash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import com.x7.jc_hotel.utilits.statusbarcolorchange


class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

           statusbarcolorchange(window = window, Color.Transparent)
            }

        }
    }

