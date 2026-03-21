package com.epuga.androidplayground.core.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class CatalogRoutes : NavKey {
    @Serializable
    data object Home : CatalogRoutes()
    @Serializable
    data class Browser(val titleTopAppBar: String) : CatalogRoutes()

    @Serializable
    data class GreetingUser(val titleTopAppBar: String): CatalogRoutes()

}