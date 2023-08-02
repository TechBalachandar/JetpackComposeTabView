package com.balu.apps.jetpackcomposetabview.tabview.tabItems

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Place
import androidx.compose.ui.unit.Constraints
import com.balu.apps.jetpackcomposetabview.tabview.utils.Constants

val tabs = listOf(
    TabItem(
        title = "Account",
        icon = Icons.Filled.AccountBox,
        screen = { TabScreen(Constants.ACCOUNT) }
    ),
    TabItem(
        title = "Favorite",
        icon = Icons.Filled.Favorite,
        screen = { TabScreen(Constants.FAVORITE) }
    ),
    TabItem(
        title = "Place",
        icon = Icons.Filled.Place,
        screen = { TabScreen(Constants.PLACE) }
    )
)
