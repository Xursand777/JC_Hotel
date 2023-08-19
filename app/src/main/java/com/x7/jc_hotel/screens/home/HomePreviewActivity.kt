@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class
)
package com.x7.jc_hotel.screens.home

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.x7.jc_hotel.screens.home.bottomscreens.Hotel
import com.x7.jc_hotel.utilits.statusbarcolorchange
import com.x7.jc_hotel.R
import com.x7.jc_hotel.screens.home.ui.theme.StarColoricon
import com.x7.jc_hotel.screens.splash.ui.theme.AppColor
import kotlinx.coroutines.*


class HomePreviewActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            statusbarcolorchange(window = window, color = Color.Transparent)
           val  hotel = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                intent.getParcelableExtra("obj",Hotel::class.java)
            }else {
                intent.getParcelableExtra<Hotel>("obj")
           }
            val hoteldata = if (hotel is Hotel)  hotel else null
            homeOpenRoomPreview(hotel = hoteldata!!, rememberPagerState {hoteldata.imagesarray.size})
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun homeOpenRoomPreview(hotel : Hotel, pagerState:PagerState) {
    val scope = rememberCoroutineScope()
    Column {
        HorizontalPager(state = pagerState, contentPadding = PaddingValues(horizontal = 50.dp)) {page:Int ->
            homeopenroomprevitem(array = hotel.imagesarray,pagenumber = page)
        }
       scope.launch{
            pagerState.animateScrollToPage(page = pagerState.currentPage+1)
        }
        
        Text(text = hotel.name,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp),
            fontFamily = FontFamily(Font(R.font.mont_bold)),
            fontSize = 26.sp
            )
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Icon(imageVector = Icons.Default.LocationOn,
                contentDescription = "location",
                tint = AppColor
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = hotel.adress,
                fontFamily = FontFamily(Font(R.font.mont_light)),
                fontSize = 18.sp,
                modifier = Modifier.wrapContentSize()
            )
            Spacer(modifier = Modifier.width(15.dp))
            Icon(painter = painterResource(id = R.drawable.round_star_24),
                contentDescription = "star",
                tint = StarColoricon
            )
            Text(text = "4.7",
                modifier = Modifier.padding(16.dp),
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.mont_light))
            )

        }
        Row() {
            Spacer(modifier = Modifier.width(19.dp))
            Icon(painter = painterResource(id = R.drawable.baseline_airline_seat_individual_suite_24),
                contentDescription = "Bed",
                tint = AppColor
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "${hotel.beds} beds",
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.mont_light))
            )
        }
        Text(text = "Hotel da ovqatlar dm yaman, abetda polov kechda oq palov,Qarochi palov yesang yaltirisan sho'rva ichsang qaltrisan",
            fontSize = 15.sp,
            fontFamily = FontFamily(Font(R.font.mont_light)),
            modifier = Modifier.padding(horizontal = 16.dp)
            )
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_fastfood_24),
                    contentDescription = "FastFood",
                    tint = AppColor
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Food",
                    fontFamily = FontFamily(Font(R.font.mont_light)),
                    maxLines = 1
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(painter = painterResource(id = R.drawable.round_wifi_24),
                    contentDescription = "Wifi",
                    tint = AppColor
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Wifi",
                    fontFamily = FontFamily(Font(R.font.mont_light)),
                    maxLines = 1
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Start
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
        Spacer(modifier = Modifier.height(15.dp))
        Row(modifier = Modifier.padding(horizontal = 16.dp) ) {
            Text(text = "Location",
                fontFamily = FontFamily(Font(R.font.mont_semibold))
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "View details",
                fontFamily = FontFamily(Font(R.font.mont_semibold)),
                color = AppColor
            )
        }

        Image(painter = painterResource(id = R.drawable.map),
            contentDescription = "map",
            modifier = Modifier.padding(16.dp).clip(shape = ShapeDefaults.Medium).fillMaxSize(),
            contentScale = ContentScale.Crop
            )

        

    }
}

@Composable
fun homeopenroomprevitem(array: Array<Int>,pagenumber:Int) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentSize()
            .padding(horizontal = 5.dp)

    ) {

        Image(
            painter = painterResource(id =array.get(pagenumber)),
            contentDescription = "room open",
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp),
            contentScale = ContentScale.Crop
        )


    }
}
