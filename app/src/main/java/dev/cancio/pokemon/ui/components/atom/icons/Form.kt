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
fun FormPreview() = Column {
    val color = listOf(
        Color.White,
    )
    color.map {
        Image(
            imageVector = Icons.Form,
            contentDescription = "loading",
            modifier = Modifier.size(100.dp)
        )
    }
}

val Icons.Form: ImageVector
    get() = materialIcon(name = "Form") {
        path(
            fill = SolidColor(Color(0xFF5AD7FF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(9.08F, 6.251F)
            curveTo(8.483F, 6.251F, 8.0F, 6.735F, 8.0F, 7.331F)
            curveTo(8.0F, 7.801F, 8.3F, 8.201F, 8.72F, 8.349F)
            verticalLineTo(20.695F)
            curveTo(8.72F, 21.85F, 9.656F, 22.787F, 10.812F, 22.787F)
            horizontalLineTo(13.188F)
            curveTo(14.344F, 22.787F, 15.28F, 21.85F, 15.28F, 20.695F)
            verticalLineTo(8.349F)
            curveTo(15.7F, 8.201F, 16.0F, 7.801F, 16.0F, 7.331F)
            curveTo(16.0F, 6.735F, 15.517F, 6.251F, 14.92F, 6.251F)
            horizontalLineTo(9.08F)

            moveTo(14.443F, 8.41F)
            horizontalLineTo(9.556F)
            verticalLineTo(8.979F)
            horizontalLineTo(11.163F)
            curveTo(11.625F, 8.979F, 12.0F, 9.354F, 12.0F, 9.816F)
            verticalLineTo(21.95F)
            horizontalLineTo(13.188F)
            curveTo(13.882F, 21.95F, 14.443F, 21.388F, 14.443F, 20.695F)
            verticalLineTo(8.41F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF23AAE6)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(8.72F, 8.349F)
            verticalLineTo(8.979F)
            horizontalLineTo(11.163F)
            curveTo(11.626F, 8.979F, 12.0F, 9.353F, 12.0F, 9.816F)
            verticalLineTo(21.949F)
            curveTo(12.0F, 22.094F, 11.964F, 22.23F, 11.899F, 22.348F)
            curveTo(11.896F, 22.355F, 11.892F, 22.361F, 11.888F, 22.368F)
            curveTo(11.744F, 22.618F, 11.473F, 22.786F, 11.163F, 22.786F)
            horizontalLineTo(13.189F)
            curveTo(14.344F, 22.786F, 15.281F, 21.85F, 15.281F, 20.694F)
            verticalLineTo(8.349F)
            curveTo(15.168F, 8.388F, 15.047F, 8.41F, 14.92F, 8.41F)
            horizontalLineTo(9.08F)
            curveTo(8.953F, 8.41F, 8.832F, 8.389F, 8.72F, 8.349F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFACB6CF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(12.0F, 21.949F)
            verticalLineTo(15.807F)
            horizontalLineTo(10.477F)
            curveTo(10.12F, 15.807F, 9.796F, 15.947F, 9.557F, 16.174F)
            verticalLineTo(20.694F)
            curveTo(9.557F, 21.388F, 10.118F, 21.949F, 10.812F, 21.949F)
            horizontalLineTo(12.0F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE241E9)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(12.0F, 21.949F)
            verticalLineTo(15.807F)
            horizontalLineTo(10.477F)
            curveTo(10.12F, 15.807F, 9.796F, 15.947F, 9.557F, 16.174F)
            verticalLineTo(20.694F)
            curveTo(9.557F, 21.388F, 10.118F, 21.949F, 10.812F, 21.949F)
            horizontalLineTo(12.0F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFACB6CF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(14.444F, 16.174F)
            curveTo(14.204F, 15.947F, 13.88F, 15.807F, 13.524F, 15.807F)
            horizontalLineTo(12.0F)
            verticalLineTo(21.949F)
            horizontalLineTo(13.189F)
            curveTo(13.882F, 21.949F, 14.444F, 21.388F, 14.444F, 20.694F)
            verticalLineTo(16.174F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC82BCF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(14.444F, 16.174F)
            curveTo(14.204F, 15.947F, 13.88F, 15.807F, 13.524F, 15.807F)
            horizontalLineTo(12.0F)
            verticalLineTo(21.949F)
            horizontalLineTo(13.189F)
            curveTo(13.882F, 21.949F, 14.444F, 21.388F, 14.444F, 20.694F)
            verticalLineTo(16.174F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC82BCF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(10.536F, 4.109F)
            lineTo(10.536F, 4.109F)
            arcTo(0.996F, 0.996F, 0.0F, false, true, 11.531F, 5.105F)
            lineTo(11.531F, 5.105F)
            arcTo(0.996F, 0.996F, 0.0F, false, true, 10.536F, 6.101F)
            lineTo(10.536F, 6.101F)
            arcTo(0.996F, 0.996F, 0.0F, false, true, 9.54F, 5.105F)
            lineTo(9.54F, 5.105F)
            arcTo(0.996F, 0.996F, 0.0F, false, true, 10.536F, 4.109F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE241E9)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(13.883F, 4.594F)
            lineTo(13.883F, 4.594F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 14.393F, 5.104F)
            lineTo(14.393F, 5.104F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 13.883F, 5.615F)
            lineTo(13.883F, 5.615F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 13.372F, 5.104F)
            lineTo(13.372F, 5.104F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 13.883F, 4.594F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE241E9)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(13.364F, 19.473F)
            lineTo(13.364F, 19.473F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 13.875F, 19.983F)
            lineTo(13.875F, 19.983F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 13.364F, 20.494F)
            lineTo(13.364F, 20.494F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 12.854F, 19.983F)
            lineTo(12.854F, 19.983F)
            arcTo(0.51F, 0.51F, 0.0F, false, true, 13.364F, 19.473F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC82BCF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(12.377F, 2.0F)
            lineTo(12.377F, 2.0F)
            arcTo(0.494F, 0.494F, 0.0F, false, true, 12.87F, 2.494F)
            lineTo(12.87F, 2.494F)
            arcTo(0.494F, 0.494F, 0.0F, false, true, 12.377F, 2.987F)
            lineTo(12.377F, 2.987F)
            arcTo(0.494F, 0.494F, 0.0F, false, true, 11.883F, 2.494F)
            lineTo(11.883F, 2.494F)
            arcTo(0.494F, 0.494F, 0.0F, false, true, 12.377F, 2.0F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC82BCF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(10.895F, 17.071F)
            curveTo(10.895F, 16.798F, 11.116F, 16.577F, 11.389F, 16.577F)
            curveTo(11.661F, 16.577F, 11.882F, 16.798F, 11.882F, 17.071F)
            curveTo(11.882F, 17.344F, 11.661F, 17.565F, 11.389F, 17.565F)
            curveTo(11.116F, 17.565F, 10.895F, 17.344F, 10.895F, 17.071F)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC82BCF)),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(9.857F, 19.648F)
            curveTo(9.857F, 19.228F, 10.198F, 18.887F, 10.619F, 18.887F)
            curveTo(11.04F, 18.887F, 11.38F, 19.228F, 11.38F, 19.648F)
            curveTo(11.38F, 20.069F, 11.04F, 20.41F, 10.619F, 20.41F)
            curveTo(10.198F, 20.41F, 9.857F, 20.069F, 9.857F, 19.648F)
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
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(9.648F, 10.402F)
            lineTo(9.648F, 10.402F)
            arcTo(0.209F, 0.209F, 0.0F, false, false, 9.439F, 10.611F)
            lineTo(9.439F, 18.427F)
            arcTo(0.209F, 0.209F, 0.0F, false, false, 9.648F, 18.636F)
            lineTo(9.648F, 18.636F)
            arcTo(0.209F, 0.209F, 0.0F, false, false, 9.857F, 18.427F)
            lineTo(9.857F, 10.611F)
            arcTo(0.209F, 0.209F, 0.0F, false, false, 9.648F, 10.402F)
            close()
        }
    }