package com.epuga.androidplayground.feature.browser

import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun BrowserScreen(){
    val context = LocalContext.current
    val webView = WebView(context)
    webView.settings.javaScriptEnabled = true
    webView.loadUrl("https://www.google.com")

    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            webView
        }
    )
}