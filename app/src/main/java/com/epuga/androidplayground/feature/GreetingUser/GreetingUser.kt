package com.epuga.androidplayground.feature.GreetingUser

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.epuga.androidplayground.core.components.FeatureTopAppBar

@Composable
fun GreetingUserScreen() {
    Scaffold(topBar = { FeatureTopAppBar(topAppBarTitle = "Greeting User") }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 12.dp,
                    end = 12.dp,
                    top = paddingValues.calculateTopPadding(),
                    bottom = paddingValues.calculateBottomPadding()
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FirstNameTextField()
            Spacer(Modifier.padding(vertical = 12.dp))
            LastNameTextField()
            Spacer(Modifier.padding(vertical = 12.dp))
            EnterButton()
        }
    }
}

@Composable
fun FirstNameTextField() {
    var firstName by remember { mutableStateOf("") }
    TextField(value = firstName, onValueChange = { firstName = it }, label = { Text("First name") })
}

@Composable
fun LastNameTextField() {
    var lastName by remember { mutableStateOf("") }
    TextField(value = lastName, onValueChange = { lastName = it }, label = { Text("Last name") })
}

@Composable
fun EnterButton() {
    Button(modifier = Modifier.fillMaxWidth(), onClick = { }) {
        Text("Enter")
    }
}