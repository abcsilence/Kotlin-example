package com.example.myapplication

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import com.example.myapplication.ui.theme.MyApplicationTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
               ProfileBody(innerPadding= innerPadding)

                }
            }
        }
    }

@Composable
fun ProfileBody(innerPadding : PaddingValues) {
    Column(
        modifier = Modifier.padding(innerPadding).background(color = Color.White).fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp)
            )

            Text(
                text = "Roshan_jaishi",
                modifier = Modifier
                    .border(2.dp, Color.Black)  // Adjust the border width and color as needed
                    .padding(4.dp),  // Optional: Adds padding inside the border to avoid text touching it
                style = TextStyle(
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp).padding(0.dp)
            )
        }
        Row (
            modifier = Modifier.height(100.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(R.drawable.logologin),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(100.dp).width(100.dp).padding(0.dp).fillMaxHeight().clip(shape = RoundedCornerShape(100.dp))

            )
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "124")
                Text(text = "Posts")
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "772k")
                Text(text = "followers")
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "714")
                Text(text = "Following")
            }
        }
        Row (
            modifier = Modifier.height(100.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Roshan jaishi",
                 style= TextStyle(color= Color.Red))
                Text(text = "done")
            }
        }
        Row (modifier = Modifier.height(100.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            OutlinedButton(onClick = {}, shape= RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )){
                Text(text = "Follow")
            }
            OutlinedButton(onClick ={} ) {
                Text(text="Message")
            }
            OutlinedButton(onClick ={}) {
                Text(text ="Email")
            }
            OutlinedButton(onClick ={}) {
                Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)

            }


        }


    }
}
@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}
