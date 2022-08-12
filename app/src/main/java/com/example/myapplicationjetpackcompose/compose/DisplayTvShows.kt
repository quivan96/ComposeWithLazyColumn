package com.example.myapplicationjetpackcompose.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplicationjetpackcompose.model.TvShow

@Composable
fun DisplayTvShows(selectedItem: (TvShow) -> Unit) {
    val tvShows = remember { com.example.myapplicationjetpackcompose.data.TvShowList.tvShows }

    LazyColumn(
        contentPadding = PaddingValues(15.dp),
        modifier = Modifier
            .background(color = Color.Gray)
    ) {
        items(
            items = tvShows,
            itemContent = {
                TvShowList(tvShow = it, selectedItem)
            }
        )
    }
}
