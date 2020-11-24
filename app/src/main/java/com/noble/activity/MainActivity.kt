package com.noble.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.noble.activity.ui.MinterComposeAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinterComposeApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun MinterComposeApp(content: @Composable () -> Unit) {
    MinterComposeAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = Color.Red) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.padding(15.dp))
}

@Composable
fun MyScreenContent(names: List<String> = listOf("Jake Wharton", "Ian Lake", "Florentina <3")) {
    Column {
        for (name in names) {
            Greeting(name = name)
            Divider(color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MinterComposeApp {
        MyScreenContent()
    }
}