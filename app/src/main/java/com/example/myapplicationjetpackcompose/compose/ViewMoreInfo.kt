package com.example.myapplicationjetpackcompose.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplicationjetpackcompose.model.TvShow

@Composable
fun ViewMoreInfo(tvShow: TvShow) {
    val scrollState = rememberScrollState()
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 10.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = tvShow.imageId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(5.dp)),
                contentScale = ContentScale.Fit
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Text(
                text = tvShow.name,
                style = MaterialTheme.typography.h3
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Text(
                text = tvShow.overview,
                style = MaterialTheme.typography.h5
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Text(
                text = "Original release ${tvShow.year.toString()}",
                style = MaterialTheme.typography.h5
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Text(
                text = "IMDB: ${tvShow.rating}",
                style = MaterialTheme.typography.h5
            )
        }

    }
}

