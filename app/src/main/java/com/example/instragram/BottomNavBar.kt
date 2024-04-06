package com.example.instragram

sealed class BottomNavScreen(
    val title:String,
    val icon : Int,
    val route:String,
){
    object Home: BottomNavScreen(title = "home", icon = R.drawable.ic_home, route = BottomNavRoute.HOME.toString())
    object Search: BottomNavScreen(title = "search", icon = R.drawable.ic_search, route = BottomNavRoute.HOME.toString())
    object Reels: BottomNavScreen(title = "reel", icon = R.drawable.ic_reel, route = BottomNavRoute.HOME.toString())
    object Notification: BottomNavScreen(title = "notification", icon = R.drawable.ic_post, route = BottomNavRoute.HOME.toString())
    object Profile: BottomNavScreen(title = "profile", icon = R.drawable.ic_user, route = BottomNavRoute.HOME.toString())
}


enum class BottomNavRoute(val route:String){
    HOME("home"),
    SEARCH("search"),
    REEL("reel"),
    NOTIFICATION("notification"),
    PROFILE("profile"),
}