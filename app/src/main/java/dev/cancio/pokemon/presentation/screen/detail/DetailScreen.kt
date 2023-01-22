package dev.cancio.pokemon.presentation.screen.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.pokemon.ui.components.molecule.TopBar


fun getAvatarUrl(id: Int) = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${id}.png"

@Composable
fun DetailScreen() = Column(
    modifier = Modifier
        .fillMaxSize()
        .background(
            Color.Green
        )
        .padding(24.dp)
){
    TopBar()
    Text(text = "815 CP")
}


@Preview(showSystemUi = true)
@Composable
fun DetailScreenPreview() = DetailScreen()