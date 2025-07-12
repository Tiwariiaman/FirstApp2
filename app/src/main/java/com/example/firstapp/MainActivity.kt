package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.Screens.WelcomeScreen
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            FirstAppTheme {

                    BusinessCardScreen()



            }
        }
    }

    @Composable
    fun BusinessCardScreen(modifier: Modifier = Modifier) {
       Column(modifier = Modifier.fillMaxSize().background(color = Color(0xFF009688))) {

           Column(
               modifier = Modifier.fillMaxWidth().weight(0.4f),
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Bottom
           ) {

               Image(
                   painter = painterResource(R.drawable.ic_launcher_foreground),
                   contentDescription = null,
               )
               Text(
                   "Aman Tiwari",
                   fontSize = 24.sp,
                   fontWeight = FontWeight.Bold
               )
               Text(
                   "Android Developer",
                   fontSize = 14.sp,
               )

           }

           Column(
               modifier = Modifier.fillMaxWidth().weight(0.4f),
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center
           ) {
               Row {
                   Icon(
                       imageVector = Icons.Default.Call,
                       contentDescription = null,
                       modifier = Modifier.size(16.dp)
                   )

                   Spacer(modifier = Modifier.width(16.dp))

                   Text("705XXXXX7", fontSize = 16.sp,)
               }
               Spacer(modifier = Modifier.height(8.dp))
               Row {
                   Icon(
                       imageVector = Icons.Default.Email,
                       contentDescription = null,
                       modifier = Modifier.size(16.dp)
                   )

                   Spacer(modifier = Modifier.width(16.dp))

                   Text("TiwariAman8205@gmail.com", fontSize = 16.sp,)
               }
               Spacer(modifier = Modifier.height(8.dp))
               Row {
                   Icon(
                       imageVector = Icons.Default.AccountCircle,
                       contentDescription = null,
                       modifier = Modifier.size(16.dp)
                   )

                   Spacer(modifier = Modifier.width(16.dp))

                   Text("aman___tiwari__", fontSize = 16.sp,)
               }

           }
       }
    }


    @Composable
    @Preview(showSystemUi = true)
    fun Prev(modifier: Modifier = Modifier) {
        BusinessCardScreen()
    }
}

