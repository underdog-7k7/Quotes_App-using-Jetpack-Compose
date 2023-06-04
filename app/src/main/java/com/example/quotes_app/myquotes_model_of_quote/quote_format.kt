package com.example.quotes_app.myquotes_model_of_quote

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quotes(
    @StringRes val stringresourceID: Int,
    @DrawableRes val imageResourceID: Int
)
