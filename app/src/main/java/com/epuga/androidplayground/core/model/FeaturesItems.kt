package com.epuga.androidplayground.core.model

import com.epuga.androidplayground.core.navigation.CatalogRoutes

data class FeaturesItems(
    val destination: CatalogRoutes,
    val title: String,
    val description: String
)

val featuresList = listOf(
    FeaturesItems(
        CatalogRoutes.Browser(titleTopAppBar = "Browser WebView"),
        "Browser Feature",
        "Browser based in WebView class adapted in Jetpack Compose"
    ),
    FeaturesItems(
        destination = CatalogRoutes.GreetingUser(titleTopAppBar = "Greeting"),
        title = "Greeting User",
        description = "Feature for catch de user data like first name and last name to display the greeting message"
    )
)