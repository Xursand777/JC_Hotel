@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.x7.jc_hotel.screens.home.bottomscreens

import android.content.Intent
import android.os.Parcelable
import android.os.Parcel
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.parcelize.Parcelize
import com.x7.jc_hotel.R
import androidx.versionedparcelable.ParcelField
import com.x7.jc_hotel.screens.home.HomePreviewActivity
import com.x7.jc_hotel.screens.home.homescreenmain
import com.x7.jc_hotel.screens.home.ui.theme.StarColoricon
import com.x7.jc_hotel.screens.splash.ui.theme.AppColor

@Composable
fun homeScreen() {
    Column(modifier = Modifier.fillMaxSize()
    ) {
        homefragmentscreen()
    }
    
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun homefragmentscreen() {
    val scrollState = rememberScrollState()
    var textfield1 by remember {
        mutableStateOf("")
    }
    var textfield2 by remember {
        mutableStateOf("")
    }
    val arrayhotel = arrayOf(
        Hotel(image = R.drawable.hotel1, name = "Khorezm", adress = "Uzbekistan", beds = 7566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
         ),
        Hotel(image = R.drawable.hotel2, name = "Urgench", adress = "Uzbekistan", beds = 6566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),Hotel(image = R.drawable.hotel3, name = "Beruniy", adress = "Qoraqolpokiston", beds = 3566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),
        Hotel(image = R.drawable.hotel1, name = "Khorezm", adress = "Uzbekistan", beds = 7566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),
        Hotel(image = R.drawable.hotel2, name = "Urgench", adress = "Uzbekistan", beds = 6566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),Hotel(image = R.drawable.hotel3, name = "Beruniy", adress = "Qoraqolpokiston", beds = 3566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),
        Hotel(image = R.drawable.hotel1, name = "Khorezm", adress = "Uzbekistan", beds = 7566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),
        Hotel(image = R.drawable.hotel2, name = "Urgench", adress = "Uzbekistan", beds = 6566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),
        Hotel(image = R.drawable.hotel3, name = "Beruniy", adress = "Qoraqolpokiston", beds = 3566,
            arrayOf(
                R.drawable.hotelroom1,
                R.drawable.hotel8room,
                R.drawable.hotel9room,
                R.drawable.hotel10room
            )
        ),

    )

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()
        .verticalScroll(scrollState)
    ) {
        Row(modifier = Modifier.padding(top = 35.dp), verticalAlignment = Alignment.CenterVertically) {

            OutlinedTextField(value = textfield1,
                onValueChange = {textfield1 = it},
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.LocationOn,
                            contentDescription = "location",
                            tint = AppColor
                        )
                    }
                },
                shape = RoundedCornerShape(35.dp),
                placeholder = { Text(text = "Uzbekistan",
                    fontFamily = FontFamily(Font(R.font.mont_light))
                )},
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = ""
                        )
                    }
                },
                modifier = Modifier.weight(1f),
                colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.LightGray, focusedBorderColor = AppColor),
                maxLines = 1
            )
            Spacer(modifier = Modifier.width(25.dp))
            Card(elevation = CardDefaults.cardElevation(1.dp),
                shape = CircleShape
            ) {
                    IconButton(onClick = { /*TODO*/ },
                        modifier = Modifier.size(50.dp)
                    ) {
                        Icon(imageVector = Icons.Default.Settings,
                            contentDescription = "Settings",
                            modifier = Modifier
                                .size(50.dp)
                                .padding(10.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Hello Xursand",
                fontFamily = FontFamily(Font(R.font.mont_light))
            )
            Text(text = "Hello Xursand ",
                fontFamily = FontFamily(Font(R.font.mont_bold)),
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(15.dp))
            
            OutlinedTextField(value = textfield2,
                onValueChange = {textfield2 = it},
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painter = painterResource(id = R.drawable.search),
                            contentDescription = "location",
                            tint = AppColor
                        )
                    }
                },
                shape = RoundedCornerShape(35.dp),
                placeholder = { Text(
                    text = "Uyim",
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
                colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.LightGray, focusedBorderColor = AppColor),
                maxLines = 1

            )
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Recomemded Hotels",
                fontFamily = FontFamily(Font(R.font.mont_semibold))
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "See All",
                    fontFamily = FontFamily(Font(R.font.mont_semibold)),
                    color = AppColor
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)){
                itemsIndexed(arrayhotel){index : Int, item : Hotel ->
                    hotellazyitem(hotel = item)
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Nearby Hotels",
                    fontFamily = FontFamily(Font(R.font.mont_semibold))
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "See All",
                    fontFamily = FontFamily(Font(R.font.mont_semibold)),
                    color = AppColor
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.height(400.dp)
                ){
                itemsIndexed(arrayhotel){index: Int, item: Hotel ->
                    lazyitem2(hotel = item)
                }
            }
        }
    }



@Composable
fun hotellazyitem(hotel: Hotel) {
    val content= LocalContext.current
    Column(modifier = Modifier
        .width(280.dp)
        .combinedClickable {

        },

    ) {
        Card(
            modifier = Modifier.padding(1.dp),
            onClick = {
                val intent = Intent(content,HomePreviewActivity::class.java)
                intent.putExtra("obj",hotel)
                content.startActivity(intent)
            }
        ) {
            Column(modifier = Modifier.padding(10.dp)
            ) {
                Image(painter = painterResource(id = hotel.image),
                    contentDescription = "hotels",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(shape = ShapeDefaults.Medium),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = hotel.name,
                    fontFamily = FontFamily(Font(R.font.mont_semibold)),
                    maxLines = 1
                    )
                Text(text = hotel.adress,
                    fontFamily = FontFamily(Font(R.font.mont_semibold)),
                    maxLines = 1
                )
                Spacer(modifier = Modifier.height(7.dp))
                Divider()
                Spacer(modifier = Modifier.height(7.dp))
                Row() {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_airline_seat_individual_suite_24),
                            contentDescription = "Bed",
                            tint = AppColor
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                          text =hotel.beds.toString(),
                          fontFamily = FontFamily(Font(R.font.mont_semibold)),
                          maxLines = 1
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(painter = painterResource(id = R.drawable.round_wifi_24),
                            contentDescription = "Bed",
                            tint = AppColor
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Wifi",
                             fontFamily = FontFamily(Font(R.font.mont_light)),
                             maxLines = 1
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(painter = painterResource(id = R.drawable.baseline_favorite_24),
                            contentDescription = "Liked",
                            tint = AppColor
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Liked",
                            fontFamily = FontFamily(Font(R.font.mont_light)),
                            maxLines = 1
                        )
                    }
                }

            }
        }
    }
}

@Composable
fun lazyitem2(hotel: Hotel) {
    Column() {
        Card(modifier = Modifier.fillMaxWidth()
        ) {
            Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = hotel.image), contentDescription = "hotel",
                    modifier = Modifier
                        .clip(ShapeDefaults.Medium)
                        .size(100.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(15.dp))
                Column(verticalArrangement = Arrangement.Center) {
                    Text(text = hotel.name,
                        fontFamily = FontFamily(Font(R.font.mont_semibold))
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = hotel.adress,
                        fontFamily = FontFamily(Font(R.font.mont_light))
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "${hotel.beds} beds",
                            fontFamily = FontFamily(Font(R.font.mont_light))
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Icon(painter = painterResource(id = R.drawable.round_star_24),
                            contentDescription = "Star",
                            tint = StarColoricon
                        )
                        Text(text = "${(0 until 5).random()}",
                            fontFamily = FontFamily(Font(R.font.mont_light))
                            )
                        Spacer(modifier = Modifier.width(7.dp))

                    }

                }
            }
        }
    }
}

@Parcelize
class Hotel constructor(
    val image:Int,
    val name:String,
    val adress:String,
    val beds:Int,
    val imagesarray:Array<Int>
):Parcelable