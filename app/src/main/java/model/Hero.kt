
package com.example.heroheadquarters.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Define what each hero card will contain
data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)