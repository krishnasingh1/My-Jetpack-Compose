package com.coderkprathore.jetpackcompose.lazycolumndog

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.coderkprathore.jetpackcompose.lazycolumndog.data.Puppy
import com.coderkprathore.jetpackcompose.ui.theme.JetpackComposeTheme

class ProfileActivity : ComponentActivity() {

    private val puppy : Puppy by lazy {
        intent?.getSerializableExtra(PUPPY_Id) as Puppy
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            JetpackComposeTheme {
                ProfileScreen(puppy = puppy)
                
            }
        }
    }
    companion object {
        private const val PUPPY_Id = "puppy-id"
        fun newIntent(context: Context, puppy: Puppy) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(PUPPY_Id,puppy)
            }
    }
}