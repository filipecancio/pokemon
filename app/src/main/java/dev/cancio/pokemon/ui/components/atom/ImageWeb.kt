package dev.cancio.pokemon.ui.components.atom

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun CompatibleImage(
    modifier: Modifier = Modifier,
    painter: Painter? = null,
    url: String? = null,
    colorFilter: ColorFilter? = null
) = if (url != null) {
    ImageWeb(
        url = url,
        modifier = modifier,
        colorFilter = colorFilter
    )
} else if (painter != null) {
    Image(
        painter = painter,
        modifier = modifier,
        colorFilter = colorFilter,
        contentDescription = null
    )
} else {
    Text(text = "")
}

@Composable
fun ImageWeb(
    url: String,
    modifier: Modifier = Modifier,
    colorFilter: ColorFilter? = null
) {
    val painter = rememberAsyncImagePainter(
        ImageRequest.Builder(LocalContext.current).data(data = url)
            .apply(block = fun ImageRequest.Builder.() {
                crossfade(true)
            }).build()
    )
    Box {
        Image(
            painter = painter,
            contentDescription = "",
            modifier = modifier,
            colorFilter = colorFilter
        )
        when (painter.state) {
            is AsyncImagePainter.State.Loading -> {
                ProgressAnimation(Modifier.align(Alignment.Center))
            }
            is AsyncImagePainter.State.Error -> {
            }
            else -> {}
        }
    }
}