package dev.cancio.pokemon.ui.components.atom

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoTag(
    value: String
) = Column() {
    Text(
        text = "$value KG",
        fontSize = 21.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White
    )
    Text(
        text = "WEIGHT",
        fontSize = 16.sp,
        color = Color.White
    )
}

@Preview
@Composable
fun InfoTagPreview() = Column {
    InfoTag("8.5")
}