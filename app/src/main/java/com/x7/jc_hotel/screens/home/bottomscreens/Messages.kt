@file:OptIn(ExperimentalMaterial3Api::class)

package com.x7.jc_hotel.screens.home.bottomscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.x7.jc_hotel.R

@Composable
fun messageScreen() {
    var textfield1 by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(35.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Messages",
                fontFamily = FontFamily(Font(R.font.mont_bold)),
                fontSize = 25.sp
                )
            Spacer(modifier = Modifier.weight(1f))
            Card(elevation = CardDefaults.cardElevation(1.dp),
                shape = CircleShape
            ) {
                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier.size(50.dp)) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        modifier = Modifier
                            .size(50.dp)
                            .padding(10.dp)
                        )
                    
                }

            }

        }
        Spacer(modifier = Modifier.height(15.dp))
        Image(painter = painterResource(id = R.drawable.nomessage),
            contentDescription = "no message",
            modifier = Modifier.fillMaxSize()
        )

    }
    
}
