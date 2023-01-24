package dev.cancio.pokemon.ui.components.atom.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CandyPreview() = Column {
    val color = listOf(
        Color.White,
        Color.Green,
        Color.Blue
    )
    color.map {
        Image(
            imageVector = Icons.Candy,
            contentDescription = "loading",
            modifier = Modifier.size(100.dp),
        )
    }
}

val Icons.Candy: ImageVector
    get() = materialIcon(name = "Candy") {
        path(
            fill = SolidColor(Color(0xFFD6204C)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(11.269F, 19.905F)
            curveTo(11.495F, 20.336F, 11.74F, 20.704F, 12.0F, 21.0F)
            curveTo(12.291F, 20.669F, 12.562F, 20.248F, 12.809F, 19.751F)
            curveTo(12.309F, 19.845F, 11.795F, 19.898F, 11.269F, 19.905F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFD50234)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(18.425F, 18.039F)
            curveTo(18.644F, 17.807F, 18.85F, 17.562F, 19.043F, 17.307F)
            lineTo(6.693F, 4.957F)
            curveTo(6.438F, 5.15F, 6.193F, 5.356F, 5.961F, 5.575F)
            lineTo(18.425F, 18.039F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFD50234)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(18.022F, 18.441F)
            curveTo(17.789F, 18.659F, 17.544F, 18.865F, 17.288F, 19.057F)
            lineTo(4.943F, 6.712F)
            curveTo(5.135F, 6.456F, 5.341F, 6.211F, 5.559F, 5.978F)
            lineTo(18.022F, 18.441F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFA1F54)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(9.848F, 9.463F)
            curveTo(9.823F, 9.706F, 9.801F, 9.952F, 9.783F, 10.202F)
            lineTo(14.149F, 14.568F)
            curveTo(14.175F, 14.325F, 14.196F, 14.079F, 14.215F, 13.829F)
            lineTo(9.848F, 9.463F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFA1F54)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(14.275F, 12.539F)
            curveTo(14.279F, 12.362F, 14.281F, 12.183F, 14.281F, 12.004F)
            curveTo(14.281F, 7.99F, 13.344F, 4.538F, 12.0F, 3.008F)
            curveTo(11.099F, 4.034F, 10.381F, 5.925F, 10.005F, 8.269F)
            lineTo(14.275F, 12.539F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFA1F54)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(9.719F, 12.004F)
            curveTo(9.719F, 11.833F, 9.721F, 11.662F, 9.724F, 11.493F)
            lineTo(13.991F, 15.76F)
            curveTo(13.731F, 17.374F, 13.308F, 18.771F, 12.775F, 19.819F)
            curveTo(12.787F, 19.796F, 12.798F, 19.774F, 12.809F, 19.751F)
            curveTo(12.309F, 19.845F, 11.795F, 19.898F, 11.269F, 19.905F)
            curveTo(10.329F, 18.112F, 9.719F, 15.24F, 9.719F, 12.004F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFF003D)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(5.832F, 5.446F)
            curveTo(5.694F, 5.576F, 5.56F, 5.71F, 5.43F, 5.849F)
            lineTo(9.783F, 10.202F)
            curveTo(9.802F, 9.952F, 9.823F, 9.706F, 9.849F, 9.463F)
            lineTo(5.832F, 5.446F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFF003D)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(14.275F, 12.539F)
            curveTo(14.279F, 12.362F, 14.281F, 12.184F, 14.281F, 12.004F)
            curveTo(14.281F, 7.991F, 13.344F, 4.538F, 12.0F, 3.008F)
            curveTo(11.099F, 4.034F, 10.381F, 5.925F, 10.005F, 8.269F)
            lineTo(6.563F, 4.827F)
            curveTo(8.074F, 3.681F, 9.957F, 3.0F, 12.0F, 3.0F)
            curveTo(14.619F, 3.0F, 16.977F, 4.119F, 18.621F, 5.904F)
            curveTo(19.579F, 7.335F, 20.138F, 9.055F, 20.138F, 10.906F)
            curveTo(20.138F, 13.008F, 19.417F, 14.942F, 18.21F, 16.474F)
            lineTo(14.275F, 12.539F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFF003D)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(14.215F, 13.829F)
            curveTo(14.196F, 14.079F, 14.175F, 14.325F, 14.149F, 14.568F)
            lineTo(17.168F, 17.587F)
            curveTo(17.309F, 17.46F, 17.446F, 17.329F, 17.578F, 17.193F)
            lineTo(14.215F, 13.829F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFF003D)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(3.0F, 12.0F)
            curveTo(3.0F, 9.966F, 3.675F, 8.089F, 4.813F, 6.582F)
            lineTo(9.724F, 11.493F)
            curveTo(9.721F, 11.663F, 9.719F, 11.833F, 9.719F, 12.004F)
            curveTo(9.719F, 15.24F, 10.329F, 18.112F, 11.269F, 19.905F)
            curveTo(11.226F, 19.906F, 11.182F, 19.906F, 11.138F, 19.906F)
            curveTo(8.519F, 19.906F, 6.162F, 18.788F, 4.517F, 17.002F)
            curveTo(3.559F, 15.571F, 3.0F, 13.851F, 3.0F, 12.0F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFF003D)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(12.809F, 19.751F)
            curveTo(13.326F, 18.712F, 13.736F, 17.34F, 13.991F, 15.76F)
            lineTo(16.423F, 18.192F)
            curveTo(15.368F, 18.958F, 14.14F, 19.501F, 12.809F, 19.751F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDE0035)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(17.578F, 17.193F)
            curveTo(17.446F, 17.328F, 17.309F, 17.46F, 17.168F, 17.587F)
            lineTo(18.151F, 18.57F)
            curveTo(18.289F, 18.44F, 18.424F, 18.306F, 18.554F, 18.168F)
            lineTo(17.578F, 17.193F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDE0035)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(19.173F, 17.437F)
            curveTo(20.319F, 15.926F, 21.0F, 14.043F, 21.0F, 12.0F)
            curveTo(21.0F, 9.648F, 20.098F, 7.507F, 18.621F, 5.904F)
            curveTo(19.579F, 7.335F, 20.138F, 9.055F, 20.138F, 10.906F)
            curveTo(20.138F, 13.008F, 19.417F, 14.942F, 18.21F, 16.474F)
            lineTo(19.173F, 17.437F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDE0035)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(12.809F, 19.751F)
            curveTo(14.14F, 19.501F, 15.368F, 18.958F, 16.423F, 18.192F)
            lineTo(17.418F, 19.187F)
            curveTo(15.911F, 20.325F, 14.034F, 21.0F, 12.0F, 21.0F)
            curveTo(12.29F, 20.669F, 12.562F, 20.248F, 12.809F, 19.751F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDE0035)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(12.0F, 21.0F)
            curveTo(8.88F, 21.0F, 6.132F, 19.413F, 4.517F, 17.002F)
            curveTo(6.162F, 18.787F, 8.519F, 19.906F, 11.138F, 19.906F)
            curveTo(11.182F, 19.906F, 11.226F, 19.906F, 11.269F, 19.905F)
            curveTo(11.495F, 20.335F, 11.74F, 20.704F, 12.0F, 21.0F)
            close()
        }
    }