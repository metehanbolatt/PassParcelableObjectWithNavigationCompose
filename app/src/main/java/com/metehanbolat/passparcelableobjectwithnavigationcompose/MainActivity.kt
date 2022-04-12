package com.metehanbolat.passparcelableobjectwithnavigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.passparcelableobjectwithnavigationcompose.ui.theme.PassParcelableObjectWithNavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PassParcelableObjectWithNavigationComposeTheme {

            }
        }
    }
}
