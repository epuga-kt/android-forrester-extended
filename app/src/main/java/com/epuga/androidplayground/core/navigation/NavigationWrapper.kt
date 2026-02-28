package com.epuga.androidplayground.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.epuga.androidplayground.feature.browser.BrowserScreen
import com.epuga.androidplayground.feature.catalog.CatalogScreen

@Composable
fun NavigationWrapper() {
    //stack
    val backstack = rememberNavBackStack(CatalogRoutes.Home)
    NavDisplay(
        //boe
        backStack = backstack,
        onBack = { backstack.back() },
        entryProvider = entryProvider {
            entry<CatalogRoutes.Home> {
                CatalogScreen { destination ->
                    backstack.navigateTo(destination)
                }
            }
            entry<CatalogRoutes.Browser>{
                BrowserScreen()
            }
        }
    )
}