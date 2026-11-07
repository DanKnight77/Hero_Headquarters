package com.example.heroheadquarters.model

import com.example.heroheadquarters.R

//Store list of our superhero's
object HeroesRepository {

    //Create list of all our information
    //Each Hero is a separate card with a reference to their name, description, and image
    //Images added to drawable folder for reference
    val heroes = listOf(
        Hero(
            nameRes = R.string.hero1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.captain_knight
        ),
        Hero(
            nameRes = R.string.hero2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.shadow_rider
        ),
        Hero(
            nameRes = R.string.hero3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.hurricane
        ),
        Hero(
            nameRes = R.string.hero4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.optimus_3000
        ),
        Hero(
            nameRes = R.string.hero5,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.aow
        ),
        Hero(
            nameRes = R.string.hero6,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.big_claws
        ),
        Hero(
            nameRes = R.string.hero7,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.trident_titan
        )
    )
}