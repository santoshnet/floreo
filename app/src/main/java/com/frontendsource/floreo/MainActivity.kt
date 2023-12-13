package com.frontendsource.floreo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.frontendsource.floreo.navigation.Navigation
import com.frontendsource.floreo.ui.theme.JetComposeLoginUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetComposeLoginUITheme {
                JetComposeLoginUiMain()
            }
        }
    }
}

@Preview
@Composable
fun JetComposeLoginUiMain() {
    JetComposeLoginUITheme {
        Surface(color = MaterialTheme.colors.background) {
            Navigation()
        }
    }
}

