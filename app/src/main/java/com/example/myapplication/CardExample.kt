//package com.example.myapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.foundation.lazy.grid.items
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.myapplication.ui.theme.MyApplicationTheme
//
//class CardActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MyApplicationTheme {
//                Scaffold { innerPadding ->
//                    CardScreen(innerPadding = innerPadding)
//                }
//            }
//        }
//    }
//}
//
//data class CardItem(val iconRes: Int, val label: String)
//
//@Composable
//fun CardScreen(innerPadding: PaddingValues) {
//    val cards = listOf(
//        CardItem(R.drawable.text_ico, "Text"),
//        CardItem(R.drawable.address_icon, "Address"),
//        CardItem(R.drawable.character_icon, "Character"),
//        CardItem(R.drawable.bankcard_icon, "Bank card"),
//        CardItem(R.drawable.password_icon, "Password"),
//        CardItem(R.drawable.logistics_icon, "Logistics")
//    )
//
//    Column(
//        modifier = Modifier
//            .padding(innerPadding)
//            .fillMaxSize()
//            .background(Color(0xFFE0F7FA)) // Light teal background
//            .padding(16.dp)
//    ) {
//        // Top section
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Column(
//                modifier = Modifier.weight(1f)
//            ) {
//                Text(
//                    text = "Card",
//                    fontSize = 26.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Black
//                )
//                Text(
//                    text = "Simple and easy to use app",
//                    fontSize = 14.sp,
//                    color = Color.Gray
//                )
//            }
//            Image(
//                painter = painterResource(id = R.drawable.logologin),
//                contentDescription = "Profile Picture",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(40.dp)
//                    .clip(CircleShape)
//                    .border(2.dp, Color.White, CircleShape)
//            )
//        }
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        // Grid Section
//        LazyVerticalGrid(
//            columns = GridCells.Fixed(2),
//            verticalArrangement = Arrangement.spacedBy(16.dp),
//            horizontalArrangement = Arrangement.spacedBy(16.dp),
//            modifier = Modifier.weight(1f)
//        ) {
//            items(cards) { card ->
//                CardItemView(card)
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Settings Button
//        Button(
//            onClick = { },
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(50.dp),
//            shape = RoundedCornerShape(12.dp),
//            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
//        ) {
//            Text(text = "Settings", color = Color.Black, fontSize = 16.sp)
//        }
//    }
//}
//
//@Composable
//fun CardItemView(card: CardItem) {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.White, shape = RoundedCornerShape(12.dp))
//            .clickable { }
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = painterResource(id = card.iconRes),
//            contentDescription = card.label,
//            modifier = Modifier.size(50.dp)
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        Text(
//            text = card.label,
//            fontSize = 16.sp,
//            fontWeight = FontWeight.Medium,
//            color = Color.Black
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun CardScreenPreview() {
//    MyApplicationTheme {
//        CardScreen(innerPadding = PaddingValues(0.dp))
//    }
//}
