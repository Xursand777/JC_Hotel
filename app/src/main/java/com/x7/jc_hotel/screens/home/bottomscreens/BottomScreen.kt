package com.x7.jc_hotel.screens.home.bottomscreens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.x7.jc_hotel.R
import com.x7.jc_hotel.screens.home.ui.theme.BottombarBackground
import com.x7.jc_hotel.screens.splash.ui.theme.AppColor

sealed class Screens constructor(
    val route :String,
    val title: String,
    val icon: Int
){
    object Home : Screens(
        route = "home_screen",
        title = "Home",
        icon = R.drawable.homeflat
    )
    object Search : Screens(
        route = "search_screen",
        title = "Search",
        icon = R.drawable.search
    )
    object Message : Screens(
        route = "message_screen",
        title = "Message",
        icon = R.drawable.email
    )
    object Profile : Screens(
        route = "profile_screen",
        title = "Profile",
        icon = R.drawable.user
    )

}

@Composable
fun RowScope.addItem(
    screens: Screens,
    currentDestination : NavDestination?,
    navhostController : NavHostController
) {
    NavigationBarItem(
        label= {
               Text(
                   text = screens.title,
                   fontFamily = FontFamily(Font(R.font.mont_light))
               )
        },
        selected = currentDestination?.hierarchy?.any { it.route == screens.route} == true,
        onClick = {
                  navhostController.navigate(screens.route)
        },
        icon = { 
            Icon(
                painter = painterResource(id = screens.icon),
                contentDescription = "",
                modifier = Modifier
                    .size(35.dp)
                    .padding(bottom = 5.dp)
                )
        },
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = AppColor,
            selectedTextColor = AppColor,
            indicatorColor = Color.White,
            unselectedIconColor = Color.Gray,
            unselectedTextColor = Color.Gray
        ),

    )
    
}

@Composable
fun BottomBar(navHostController: NavHostController) {
    val screens = listOf(
        Screens.Home,
        Screens.Search,
        Screens.Message,
        Screens.Profile,
    )

    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar(
        containerColor = BottombarBackground
    ) {
        screens.forEach{
            addItem(
                screens = it,
                currentDestination = currentDestination,
                navhostController = navHostController
            )
        }

    }
}

@Composable
fun bottomNavGraphSetup(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = Screens.Home.route ){
        composable(route = Screens.Home.route){homeScreen()}
        composable(route = Screens.Search.route){searchScreen()}
        composable(route = Screens.Message.route){messageScreen()}
        composable(route = Screens.Profile.route){profileScreen()}
    }
    
}


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun bottombarScreen() {

    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomBar(navHostController = navController)}
    ) {
        bottomNavGraphSetup(navHostController = navController)
    }
}
