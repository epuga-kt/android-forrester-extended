package com.epuga.androidplayground.core.model

import com.epuga.androidplayground.core.navigation.CatalogRoutes

data class FeaturesItems(
    val destination: CatalogRoutes,
    val title: String,
    val description: String
)

val featuresList = listOf(
    FeaturesItems(
        CatalogRoutes.Browser,
        "Browser Feature",
        "Browser based in WebView class adapted in Jetpack Compose"
    )
)