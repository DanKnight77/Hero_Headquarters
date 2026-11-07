package com.example.heroheadquarters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Surface
import com.example.heroheadquarters.model.HeroesRepository
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.heroheadquarters.ui.theme.HeroHeadquartersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //Set up theme and main screen
        setContent {
            HeroHeadquartersTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ){
                    HeroHeadquartersApp()
                }
            }
        }
    }
}

//Create main screen with list of superhero's
@Composable
fun HeroHeadquartersApp() {
    HeroesList(
        //Reference our hero data
        heroes = HeroesRepository.heroes
    )
}

//Preview our app
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HeroHeadquartersTheme {
    }
}