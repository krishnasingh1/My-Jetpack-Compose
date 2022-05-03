package com.coderkprathore.jetpackcompose.lazycolumndog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.coderkprathore.jetpackcompose.lazycolumndog.data.Puppy

@Composable
fun ProfileScreen(puppy: Puppy) {
    val scrollState = rememberScrollState()
    
    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                ) {
                    // TODO:
                   ProfileHeader(puppy = puppy, containerHeight = this@BoxWithConstraints.maxHeight)
                    ProfileContent(puppy = puppy, containerHeight = this@BoxWithConstraints.maxHeight)
                }

            }

        }
        
    }

}

@Composable
private fun ProfileHeader(
    puppy: Puppy,
    containerHeight: Dp
) {
    Image(modifier = Modifier
        .heightIn(max = containerHeight / 2)
        .fillMaxWidth(),
        painter = painterResource(id =puppy.puppyImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null)
}

@Composable
private fun ProfileContent(puppy: Puppy,
                           containerHeight: Dp
) {
    // TODO
    Title(puppy = puppy)
    ProfileProperty(label = stringResource(id =com.coderkprathore.jetpackcompose.R.string.sex), value =puppy.sex)
    ProfileProperty(label = stringResource(id =com.coderkprathore.jetpackcompose.R.string.age), value =puppy.age.toString())
    ProfileProperty(label = stringResource(id =com.coderkprathore.jetpackcompose.R.string.personality), value =puppy.description)
    
    Spacer(modifier = Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))


}

@Composable
private fun Title(puppy: Puppy) {

    Column(modifier = Modifier
        .padding(16.dp)) {
        
        Text(text = puppy.title,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun ProfileProperty(label: String, value: String) {

    Column(modifier = Modifier
        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Visible
        )

    }




}