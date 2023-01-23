package dev.cancio.pokemon.ui.components.atom


import androidx.compose.animation.Animatable
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProgressAnimation(
    modifier: Modifier = Modifier,
    color: Color = Color.White
) {
    val animatedColor = remember { Animatable( color) }

    LaunchedEffect(animatedColor) {
        animatedColor.animateTo(
            targetValue = color,
            animationSpec = infiniteRepeatable(
                animation = keyframes {
                    durationMillis = 1000
                    color at 0 with LinearOutSlowInEasing
                    color.copy(alpha = 0.8F) at 200 with LinearOutSlowInEasing
                    color.copy(alpha = 0.4F) at 400 with LinearOutSlowInEasing
                    color.copy(alpha = 0.2F) at 800 with LinearOutSlowInEasing
                }
            )
        )
    }
    Icon(
        imageVector = Icons.Filled.Build,
        contentDescription = "loading",
        modifier = modifier,
        tint = animatedColor.value
    )
}

@Preview
@Composable
fun ProgressAnimationPreview() {
    ProgressAnimation()
}