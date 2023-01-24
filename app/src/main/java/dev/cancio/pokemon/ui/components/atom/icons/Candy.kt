package dev.cancio.pokemon.ui.components.atom.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.pokemon.ui.theme.ColorPallet

@Preview
@Composable
fun CandyPreview() = LazyVerticalGrid(
    columns = GridCells.Adaptive(60.dp),
    content = {
        items(color.size) { index ->

            color.map {
                Image(
                    imageVector = candyPath(color[index]),
                    contentDescription = "loading",
                    modifier = Modifier.size(50.dp)
                )
            }
        }
    }
)

val Icons.Candy: ImageVector
    get() = candyPath()


fun candyPath(
    color: ColorPallet = ColorPallet.Pink
) = materialIcon(name = "Candy") {
    path(
        fill = SolidColor(color.color02),
    ) {
        moveTo(4.796F, 7.529F)
        curveTo(7.073F, 3.586F, 12.115F, 2.235F, 16.058F, 4.511F)
        curveTo(20.001F, 6.788F, 21.352F, 11.83F, 19.076F, 15.773F)
        curveTo(16.799F, 19.716F, 11.757F, 21.067F, 7.814F, 18.791F)
        curveTo(3.871F, 16.514F, 2.52F, 11.472F, 4.796F, 7.529F)
        close()
    }
    path(
        fill = SolidColor(color.color01),
    ) {
        moveTo(18.829F, 7.649F)
        curveTo(16.282F, 9.454F, 12.816F, 9.726F, 9.935F, 8.063F)
        curveTo(8.735F, 7.37F, 7.776F, 6.422F, 7.085F, 5.326F)
        curveTo(9.566F, 3.425F, 13.045F, 3.089F, 15.921F, 4.749F)
        curveTo(17.172F, 5.472F, 18.153F, 6.482F, 18.829F, 7.649F)
        close()
    }
    path(
        fill = SolidColor(color.color03),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(4.042F, 7.201F)
        curveTo(4.744F, 5.986F, 6.299F, 5.569F, 7.514F, 6.271F)
        lineTo(18.7F, 12.729F)
        curveTo(19.916F, 13.431F, 20.332F, 14.986F, 19.631F, 16.201F)
        curveTo(18.928F, 17.417F, 17.374F, 17.834F, 16.158F, 17.132F)
        lineTo(4.972F, 10.674F)
        curveTo(3.757F, 9.972F, 3.34F, 8.417F, 4.042F, 7.201F)
        close()
    }
    path(
        fill = SolidColor(color.color01)
    ) {
        moveTo(4.217F, 7.356F)
        curveTo(4.856F, 6.249F, 6.271F, 5.87F, 7.377F, 6.509F)
        lineTo(16.024F, 11.501F)
        curveTo(17.13F, 12.14F, 17.509F, 13.555F, 16.871F, 14.661F)
        curveTo(16.232F, 15.767F, 14.817F, 16.146F, 13.711F, 15.508F)
        lineTo(5.064F, 10.515F)
        curveTo(3.958F, 9.876F, 3.579F, 8.462F, 4.217F, 7.356F)
        close()
    }
    path(
        fill = SolidColor(Color(0xFFBEEFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.EvenOdd,
    ) {
        moveTo(18.446F, 8.842F)
        curveTo(18.469F, 8.832F, 18.48F, 8.805F, 18.47F, 8.782F)
        curveTo(18.058F, 7.842F, 17.449F, 7.002F, 16.684F, 6.318F)
        curveTo(15.92F, 5.634F, 15.017F, 5.122F, 14.038F, 4.816F)
        curveTo(13.058F, 4.511F, 12.025F, 4.42F, 11.007F, 4.548F)
        curveTo(9.989F, 4.677F, 9.01F, 5.022F, 8.138F, 5.561F)
        curveTo(8.127F, 5.568F, 8.12F, 5.578F, 8.117F, 5.59F)
        curveTo(8.114F, 5.602F, 8.116F, 5.614F, 8.123F, 5.625F)
        lineTo(8.209F, 5.765F)
        curveTo(8.223F, 5.786F, 8.251F, 5.793F, 8.272F, 5.78F)
        curveTo(9.114F, 5.26F, 10.057F, 4.926F, 11.039F, 4.802F)
        curveTo(12.02F, 4.678F, 13.017F, 4.767F, 13.961F, 5.061F)
        curveTo(14.906F, 5.355F, 15.776F, 5.849F, 16.513F, 6.509F)
        curveTo(17.251F, 7.168F, 17.838F, 7.978F, 18.235F, 8.884F)
        curveTo(18.24F, 8.896F, 18.249F, 8.904F, 18.26F, 8.909F)
        curveTo(18.272F, 8.913F, 18.284F, 8.913F, 18.295F, 8.908F)
        lineTo(18.446F, 8.842F)

        moveTo(8.248F, 5.74F)
        curveTo(9.095F, 5.217F, 10.045F, 4.882F, 11.033F, 4.757F)
        curveTo(12.021F, 4.632F, 13.024F, 4.721F, 13.975F, 5.017F)
        curveTo(14.926F, 5.313F, 15.802F, 5.81F, 16.544F, 6.474F)
        curveTo(16.637F, 6.557F, 16.727F, 6.643F, 16.815F, 6.73F)
        curveTo(16.727F, 6.643F, 16.637F, 6.557F, 16.544F, 6.474F)
        curveTo(15.802F, 5.81F, 14.926F, 5.314F, 13.975F, 5.017F)
        curveTo(13.024F, 4.721F, 12.021F, 4.632F, 11.033F, 4.757F)
        curveTo(10.045F, 4.882F, 9.095F, 5.217F, 8.248F, 5.741F)
        lineTo(8.248F, 5.74F)

        moveTo(18.409F, 8.758F)
        curveTo(18.103F, 8.071F, 17.689F, 7.437F, 17.186F, 6.881F)
        curveTo(17.694F, 7.443F, 18.111F, 8.083F, 18.418F, 8.779F)
        curveTo(18.421F, 8.786F, 18.425F, 8.793F, 18.428F, 8.8F)
        lineTo(18.277F, 8.866F)
        lineTo(18.277F, 8.866F)
        lineTo(18.428F, 8.8F)
        lineTo(18.418F, 8.779F)
        lineTo(18.409F, 8.758F)
        close()
    }
}