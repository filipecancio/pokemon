package dev.cancio.pokemon.ui.components.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.pokemon.ui.components.atom.icons.Candy

@Composable
fun BottomBar() = Row(
    modifier = Modifier
        .clip(RoundedCornerShape(
            topStart = 64.dp,
            bottomStart = 64.dp,
            topEnd = 8.dp,
            bottomEnd = 8.dp
        ))
        .fillMaxWidth()
        .background(Color.White)
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(64.dp))
            .background(Color(0XFF91D077))
            .padding(32.dp,8.dp)

    ) {
        Text(text = "POWER UP")
    }
    Row{
        Icon(
            imageVector = Icons.Filled.Info,
            contentDescription = "loading",
        )
        Text(text= "4,500")
    }
    Row{
        Icon(
            imageVector = Icons.Candy,
            contentDescription = "loading",
            modifier = Modifier.size(32.dp)
        )
        Text(text= "4")
    }

}

@Preview
@Composable
fun BottomBarPreview() = Column {
    BottomBar()
    BottomBar()
}