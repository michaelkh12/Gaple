package com.example.Gaple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gaple.ui.theme.GapleTheme
import com.example.gaple.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GapleTheme {
                Gaple()
            }
        }
    }
}
@Preview
@Composable
fun Gaple() {
    DiceWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable._00
        2 -> R.drawable._01
        3 -> R.drawable._02
        4 -> R.drawable._03
        5 -> R.drawable._04
        6 -> R.drawable._05
        7 -> R.drawable._06
        8 -> R.drawable._11
        9 -> R.drawable._12
        10 -> R.drawable._13
        11 -> R.drawable._14
        12 -> R.drawable._15
        13 -> R.drawable._16
        14 -> R.drawable._22
        15 -> R.drawable._23
        16 -> R.drawable._24
        17 -> R.drawable._25
        18 -> R.drawable._26
        19 -> R.drawable._33
        20 -> R.drawable._34
        21 -> R.drawable._35
        22 -> R.drawable._36
        23 -> R.drawable._44
        24 -> R.drawable._45
        25 -> R.drawable._46
        26 -> R.drawable._55
        27 -> R.drawable._56
        28 -> R.drawable._66
        else -> R.drawable._66
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = result.toString()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..28).random()}) {
            Text(stringResource(R.string.shuffle))
        }

    }
}
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    DiceRollerTheme {
//        Greeting("Android")
//    }
//}