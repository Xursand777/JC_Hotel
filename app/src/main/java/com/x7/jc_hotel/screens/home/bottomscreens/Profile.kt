@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.x7.jc_hotel.screens.home.bottomscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.x7.jc_hotel.R
import com.x7.jc_hotel.screens.splash.ui.theme.AppColor

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun profileScreen() {
    Column(modifier = Modifier.background(Color.White)
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(35.dp))
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Profile",
                    fontFamily = FontFamily(Font(R.font.mont_bold)),
                    fontSize = 25.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                Card(elevation = CardDefaults.cardElevation(1.dp),
                    shape = CircleShape
                ) {
                    IconButton(onClick = { /*TODO*/ },
                        modifier = Modifier.size(50.dp)) {
                        Icon(painter = painterResource(id = R.drawable.user),
                            contentDescription = "User",
                            modifier = Modifier
                                .size(50.dp)
                                .padding(10.dp)
                        )
                        
                    }
                }
            }
            Spacer(modifier = Modifier.height(25.dp))
            Image(painter = painterResource(id = R.drawable.cat),
                contentDescription = "Cat",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .align(alignment = CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "A Xursand",
                fontFamily = FontFamily(Font(R.font.mont_light)),
                fontSize = 30.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Uzbekistan",
                fontFamily = FontFamily(Font(R.font.mont_light)),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Card(elevation = CardDefaults.cardElevation(16.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = CircleShape
            ) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "27",
                            fontFamily = FontFamily(Font(R.font.mont_bold)),
                            fontSize = 30.sp,
                            textAlign = TextAlign.Center,
                            color = AppColor
                        )
                        Text(text = "Transaction",
                            fontFamily = FontFamily(Font(R.font.mont_light)),
                            textAlign = TextAlign.Center
                        )

                    }
                    Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "100",
                            fontFamily = FontFamily(Font(R.font.mont_bold)),
                            fontSize = 30.sp,
                            textAlign = TextAlign.Center,
                            color = AppColor
                        )
                        Text(text = "Review",
                            fontFamily = FontFamily(Font(R.font.mont_light)),
                            textAlign = TextAlign.Center
                        )

                    }
                    Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "4",
                            fontFamily = FontFamily(Font(R.font.mont_bold)),
                            fontSize = 30.sp,
                            textAlign = TextAlign.Center,
                            color = AppColor
                        )
                        Text(text = "Booking",
                            fontFamily = FontFamily(Font(R.font.mont_light)),
                            textAlign = TextAlign.Center
                        )

                    }


                }
            }
            Spacer(modifier = Modifier.height(14.dp))
            Text(text = "Options",
                fontFamily = FontFamily(Font(R.font.mont_bold)),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(14.dp))
            Card(elevation = CardDefaults.cardElevation(16.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = CircleShape,
                onClick = {

                }
                ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.baseline_favorite_24), contentDescription = "liked")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Trasaction",
                        fontFamily = FontFamily(Font(R.font.mont_light)),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "liked")

                }
            }
            Spacer(modifier = Modifier.height(14.dp))
            Card(elevation = CardDefaults.cardElevation(16.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = CircleShape,
                onClick = {

                }
                ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.round_star_24), contentDescription = "liked")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Trasaction",
                        fontFamily = FontFamily(Font(R.font.mont_light)),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "liked")

                }
            }
            Spacer(modifier = Modifier.height(14.dp))
            Card(elevation = CardDefaults.cardElevation(16.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = CircleShape,
                onClick = {

                }
            ){
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.baseline_airline_seat_individual_suite_24), contentDescription = "liked")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Trasaction",
                        fontFamily = FontFamily(Font(R.font.mont_light)),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "liked")

                }
            }
            Spacer(modifier = Modifier.height(14.dp))
            Card(elevation = CardDefaults.cardElevation(16.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = CircleShape,
                onClick = {

                }
            ){
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.round_location_on_24),
                        contentDescription = "liked"
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Trasaction",
                        fontFamily = FontFamily(Font(R.font.mont_light)),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "liked"
                    )

                }
            }


        }

    }
    
}

