package com.epuga.androidplayground.core.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class CatalogRoutes: NavKey{
    @Serializable
    data object Home: CatalogRoutes()
    @Serializable
    data object Browser: CatalogRoutes()
}