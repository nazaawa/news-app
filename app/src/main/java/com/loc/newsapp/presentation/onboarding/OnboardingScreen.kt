package com.loc.newsapp.presentation.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.loc.newsapp.presentation.onboarding.components.OnboardingPage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
    val pageState = rememberPagerState(initialPage  = 0) { pages.size    }

        val buttonState = remember {
            derivedStateOf {
                when(pageState.currentPage) {
                    0 -> listOf("", "Next")
                    1 -> listOf("Previous", "Next")
                    2 -> listOf("Previous", "Done")
                    else -> listOf("", "")
                }
            }
        }
        
        HorizontalPager(state = pageState) {
            OnboardingPage(
                page = pages[it],
            )
        }

    }
}