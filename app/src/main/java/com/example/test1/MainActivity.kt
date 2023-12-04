package com.example.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test1.ui.theme.Test1Theme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
                    LogoHeader()
                }
            }
        }
    }
}
@Composable
fun LogoHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(16.dp), // Отступы для Row (здесь 16dp)

    ){
        Image(
            painter = painterResource(id = R.drawable.logo), // Использование вашего логотипа
            contentDescription = null,
            modifier = Modifier
                .size(100.dp) // Размер изображения
                .padding(end = 16.dp) // Отступы для изображения справа (здесь 16dp)
        )

        Text(
            text = "Бесплатная доставка от 700р \n Вологда, ул. Щетинина 15а",
            color = Color.White, // Цвет текста
            modifier = Modifier.fillMaxWidth() // Занимать доступное пространство по ширине
        )
    }
}

