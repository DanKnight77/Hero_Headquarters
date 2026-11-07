package com.example.heroheadquarters

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.heroheadquarters.model.Hero
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.Color

@Composable
fun HeroListItem(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    //Use card statement to create an individual card for each superhero
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF24466F)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(20.dp),
        modifier = modifier
    ) {
        //Use row statement to place our description and image next to one another
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            //Use column to stack our superhero name on top of description
            Column(
                modifier = Modifier.weight(1f)
            ) {
                //Text for name
                Text(
                    text = stringResource(hero.nameRes),
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
                //Create buffer
                Spacer(modifier = Modifier.height(8.dp))
                //Text for description
                Text(
                    text = stringResource(hero.descriptionRes),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White
                )
            }
            //Adds space between left and right
            Spacer(modifier = Modifier.width(16.dp))
            //Reference our images
            Image(
                painter = painterResource(hero.imageRes),
                contentDescription = stringResource(hero.nameRes),
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
        }
    }
}           //Create our scrollable list
            @Composable
            fun HeroesList(
                heroes: List<Hero>,
                modifier: Modifier = Modifier
            ) {
                //Stack each card, use padding to give space between them and top of app
                LazyColumn(
                    modifier = modifier,
                    contentPadding = PaddingValues(
                        start = 12.dp,
                        end = 12.dp,
                        top = 40.dp,
                        bottom = 20.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    //Create loop to go through each hero and create a card for each one
                    items(heroes) { hero ->
                        HeroListItem(
                            hero = hero,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }