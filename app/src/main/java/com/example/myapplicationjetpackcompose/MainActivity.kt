package com.example.myapplicationjetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myapplicationjetpackcompose.compose.DisplayTvShows

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayTvShows {
//                Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
                startActivity(InfoActivity.intent(this, it))
            }
        }
    }
}
