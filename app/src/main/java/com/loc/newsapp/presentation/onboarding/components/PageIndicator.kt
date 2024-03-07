package com.loc.newsapp.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.loc.newsapp.presentation.Dimens.indicatorSize
import com.loc.newsapp.ui.theme.BlueGray

@Composable
fun PageIndicator(
    modifier:  Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.primary,
    unselectedColor: androidx.compose.ui.graphics.Color = BlueGray

) {
    Row (modifier = modifier, horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(pageSize) {
            Box(
                modifier = Modifier.size(indicatorSize).clip(CircleShape).background(if (it == selectedPage) selectedColor else unselectedColor)            )
        }

    }
}


@Preview
@Composable
fun PageIndicatorPreview() {
    PageIndicator(pageSize = 3, selectedPage = 0)
}