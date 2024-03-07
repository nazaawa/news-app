package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)


val pages =  listOf(
    Page(
        title = "News",
        description = "Get the latest news from around the world",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Categories",
        description = "Browse news by categories",
        image = R.drawable.onboarding2
    ),
    Page(

        title = "Search",
        description = "Search for news by title",
        image = R.drawable.onboarding3
    )
)