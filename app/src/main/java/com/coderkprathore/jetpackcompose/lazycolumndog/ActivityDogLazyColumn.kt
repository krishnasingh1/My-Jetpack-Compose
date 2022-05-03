package com.coderkprathore.jetpackcompose.lazycolumndog

import android.content.Intent
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.coderkprathore.jetpackcompose.lazycolumndog.data.Puppy
import com.coderkprathore.jetpackcompose.ui.theme.JetpackComposeTheme

class ActivityDogLazyColumn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                MyApp {
                    startActivity(ProfileActivity.newIntent(this, it))
                }

            }
        }
    }
}

@Composable
fun MyApp(navigateToProfile: (Puppy) -> Unit) {
    Scaffold(
        content = {
            BarkHomeContent(navigateToProfile = navigateToProfile)
        }
    )

}