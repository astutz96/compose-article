package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        text1 = getString(R.string.tutorial_title),
                        text2 = getString(R.string.tutorial_desc_1),
                        text3 = getString(R.string.tutorial_desc_2)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    ComposeArticleTheme {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                text = text1,
                fontSize = 24.sp,
                modifier = modifier
                    .padding(16.dp)
            )
            Text(
                text = text2,
                modifier = modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp
                    )
            )
            Text(
                text = text3,
                textAlign = TextAlign.Justify,
                modifier = modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "My Preview")
@Composable
fun BirthdayCardPreview() {
    ComposeArticleTheme {
        Article("Jetpack Compose tutorial", "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}

