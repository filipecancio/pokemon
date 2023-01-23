package dev.cancio.pokemon.presentation.screen.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.cancio.pokemon.ui.components.atom.CompatibleImage
import dev.cancio.pokemon.R
import dev.cancio.pokemon.ui.components.atom.InfoTag
import dev.cancio.pokemon.ui.components.molecule.BottomBar
import dev.cancio.pokemon.ui.components.molecule.TopBar


fun getAvatarUrl(id: Int) =
    "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${id}.png"

@Composable
fun DetailScreen() = Column(
    modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.verticalGradient(
                listOf(
                    Color(0XFF9CCE87),
                    Color(0XFFACDA39)
                )
            )
        )
        .padding(24.dp)
) {
    TopBar()
    Text(
        text = "815 CP",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White
    )
    CompatibleImage(
        //url = getAvatarUrl(1),
        painter = painterResource(id = R.drawable.bulbassaur),
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
    )

    Text(
        text = "Bulbasaur",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(
                color = Color(0x26FFFFFF)
            )
            .padding(
                horizontal = 32.dp,
                vertical = 16.dp
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            InfoTag(value = "8.5")
            InfoTag(value = "8.5")
            InfoTag(value = "8.5")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            InfoTag(value = "8.5")
            InfoTag(value = "8.5")
        }
    }

    BottomBar()
    BottomBar()
}


@Preview(showSystemUi = true)
@Composable
fun DetailScreenPreview() = DetailScreen()