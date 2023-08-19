@file:OptIn(ExperimentalMaterial3Api::class)

package com.x7.jc_hotel.screens.home.bottomscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.x7.jc_hotel.R
import com.x7.jc_hotel.screens.splash.ui.theme.AppColor

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun searchScreen() {
    var textfield1 by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(35.dp))
       Row(modifier = Modifier.fillMaxWidth(),
           verticalAlignment = Alignment.CenterVertically) {
           Text(text = "Search",
               fontFamily = FontFamily(Font(R.font.mont_bold)),
               fontSize = 25.sp
           )
           Spacer(modifier = Modifier.weight(1f))
           Card(elevation = CardDefaults.cardElevation(1.dp),
               shape = CircleShape
           ) {
               IconButton(onClick = { /*TODO*/ },
                   modifier = Modifier.size(50.dp)
               ) {
                   Icon(imageVector = Icons.Default.Notifications,
                       contentDescription = "Notification",
                       modifier = Modifier
                           .size(50.dp)
                           .padding(10.dp)
                   )
                   
               }
           }
       }
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(value = textfield1,
            onValueChange = {textfield1 = it},
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.search),
                        contentDescription = "Search",
                        tint = AppColor
                    )
                }
            },
            shape = RoundedCornerShape(35.dp),
            placeholder = {
                Text(text = "Uzbekistan",
                    fontFamily = FontFamily(Font(R.font.mont_light))
                ) },
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.baseline_filter_list_24),
                        contentDescription = "location"
                    )
                    
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.LightGray, focusedBorderColor = AppColor)
            )
    }
    
}
