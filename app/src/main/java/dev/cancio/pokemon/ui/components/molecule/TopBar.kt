package dev.cancio.pokemon.ui.components.molecule

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopBar() = Row(
    modifier = Modifier
        .fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween
) {
    Icon(
        imageVector = Icons.Outlined.ArrowBack,
        contentDescription = null,
        tint = Color.White
    )
    Icon(
        imageVector = Icons.Outlined.Star,
        contentDescription = null,
        tint = Color.White
    )
}

@Preview
@Composable
fun TopBarDetail() = TopBar()