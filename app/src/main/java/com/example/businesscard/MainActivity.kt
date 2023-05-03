package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BasicInfo(name: String, role: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(160.dp)
                .padding(bottom = 4.dp)
        )

        Text(
            text = name,
            color = Color(color = 0xFFFFFFFF),
            fontSize = 36.sp
        )

        Text(
            text = role,
            color = Color(color = 0xFF3ddc84),
            fontSize = 20.sp
        )
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(bottom = 12.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84)
            )
            Text(
                text = "+258 84 399 77 30",
                modifier = Modifier
                        .padding(start = 8.dp),
                color = Color(color = 0xFFFFFFFF),
                fontSize = 18.sp
            )
        }

        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84)
            )
            Text(
                text = "@jeffermarcelino",
                modifier = Modifier
                    .padding(start = 8.dp),
                color = Color(0xFFFFFFFF),
                fontSize = 18.sp
            )
        }

        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84)
            )
            Text(
                text = "jeffersunde72@gmail",
                modifier = Modifier
                    .padding(start = 8.dp),
                color = Color(color = 0xFFFFFFFF),
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .background(color = Color(0xFF073042))
            .padding(start = 24.dp, end = 24.dp)
    ) {
        BasicInfo(name = "Jeffer Marcelino", role = "Android Developer")
        ContactInfo(modifier = Modifier.align(alignment = Alignment.BottomCenter))
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}