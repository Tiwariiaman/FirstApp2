package com.example.firstapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Composable
//fun Counter(){
//    var count by remember { mutableStateOf( 0) }
//
//    Text("$count" , modifier = Modifier.padding(16.dp), color = Color.Red)
//
//    Button(onClick = {
//        count++
//    }) { Text("Click Me!") }
//}

// Column learing

//@Composable
//fun layoutLearn(modifier: Modifier = Modifier) {
//    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
//        Text("hello Aman")
//        Text("Hello Shivam")
//        Button(onClick = {
//
//        }) { Text("Click Me ") }
//    }
//}

//Row learing

@Composable
fun layoutLearing(modifier: Modifier = Modifier) {
//    Row(modifier = Modifier.fillMaxSize(),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center ) {
//
//        Text("hello Aman")
//        Text("Hello Shivam")
//        Button(onClick = {
//
//        }) { Text("Click Me ") }
//    }


    // Box Layout
//    Box(modifier = Modifier.fillMaxSize()){
//        Image(painter = painterResource(R.drawable.ic_launcher_foreground),
//            contentDescription = null,
//            modifier=Modifier.width(200.dp).height(200.dp).align(Alignment.Center).background(color = colorResource( R.color.teal_200)))
//
//        Text("Android Studio", modifier = Modifier.align(Alignment.Center).padding(top = 90.dp), color = Color.White)
//    }


    // LazyColumn
//    LazyColumn{ items(count = 100){ index->
//        Text("Food items $index", modifier=Modifier.padding(8.dp))
//    }  }

//    LazyRow { items(count = 20){ index->
//        Text("Food List $index", modifier=Modifier.padding(32.dp))
//    } }

}

@Composable
@Preview(showSystemUi = true)
fun layoutPrev(modifier: Modifier = Modifier) {
    layoutLearing()
}