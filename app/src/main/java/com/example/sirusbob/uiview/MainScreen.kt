package com.example.sirusbob.uiview

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sirusbob.R;

@Composable
fun MainScreen() {

}

@Composable
fun Penis(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .padding(16.dp),


            ) {
            Image(
                modifier = Modifier,
                painter = painterResource(id = R.drawable.penis_1),
                contentDescription = null,
                contentScale = ContentScale.Crop,

                )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.penis_2),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(300.dp)


            )
            Spacer(modifier = Modifier.height(10.dp))
            Image(
                painter = painterResource(id = R.drawable.penis_2),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(300.dp)


            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    Penis()
}