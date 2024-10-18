package com.example.tugas2praktikum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas2praktikum.ui.theme.Tugas2PraktikumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas2PraktikumTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HalamanLogin(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun HalamanLogin(modifier: Modifier = Modifier){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
        ){
        Text("Login",
            fontSize = 100.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif)
        Spacer(modifier = Modifier.padding(2.dp))
        Text("Ini adalah Halaman Login",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif)
        Spacer(modifier = Modifier.padding(5.dp))

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp)
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text("Nama",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif)
        Text("Muhammad Arif Fajri Rahmadi",
            fontSize = 20.sp,
            color = Color.Red)
        Text("20220140171",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.padding(5.dp))
        Image(
            painter = painterResource(id = R.drawable.fotoku),
            contentDescription = "",
            modifier = Modifier
                .size(500.dp)
                .clip(CircleShape)
                .padding(4.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas2PraktikumTheme {
        HalamanLogin()
    }
}