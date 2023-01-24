package dev.cancio.pokemon.ui.components.atom.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.pokemon.ui.theme.ColorPallet

@Preview
@Composable
fun EnvolvePreview() = LazyVerticalGrid(
    columns = GridCells.Adaptive(60.dp),
    content = {
        items(color.size) { index ->

            color.map {
                Image(
                    imageVector = envolvePath(color[index]),
                    contentDescription = "loading",
                    modifier = Modifier.size(50.dp)
                )
            }
        }
    }
)

val Icons.Envolve: ImageVector
    get() = envolvePath()


fun envolvePath(
    color: ColorPallet = ColorPallet.Pink
) = materialIcon(name = "Envolve") {
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
            moveTo(20.055F, 7.165F)
            moveToRelative(-0.605F, -0.162F)
            arcToRelative(0.626F, 0.626F, 60.0F, true, true, 1.21F, 0.324F)
            arcToRelative(0.626F, 0.626F, 60.0F, true, true, -1.21F, -0.324F)
            close()
        }
        path(
            fill = SolidColor(color.color01),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(19.434F, 7.091F)
            lineTo(19.431F, 7.091F)
            curveTo(18.882F, 9.141F, 17.85F, 10.118F, 16.6F, 10.638F)
            curveTo(15.286F, 11.184F, 13.69F, 11.247F, 11.939F, 11.316F)
            lineTo(11.939F, 11.316F)
            lineTo(11.928F, 11.317F)
            curveTo(10.23F, 11.384F, 8.38F, 11.458F, 6.804F, 12.147F)
            curveTo(5.185F, 12.855F, 3.904F, 14.184F, 3.238F, 16.596F)
            curveTo(3.23F, 16.617F, 3.223F, 16.638F, 3.217F, 16.66F)
            curveTo(3.127F, 16.994F, 3.326F, 17.338F, 3.66F, 17.427F)
            curveTo(3.994F, 17.517F, 4.337F, 17.319F, 4.427F, 16.984F)
            curveTo(4.433F, 16.959F, 4.438F, 16.934F, 4.442F, 16.909F)
            curveTo(5.018F, 14.841F, 6.058F, 13.831F, 7.302F, 13.287F)
            curveTo(8.625F, 12.709F, 10.227F, 12.629F, 11.977F, 12.56F)
            lineTo(12.112F, 12.555F)
            lineTo(12.112F, 12.555F)
            curveTo(13.767F, 12.49F, 15.555F, 12.42F, 17.077F, 11.787F)
            curveTo(18.706F, 11.11F, 19.99F, 9.812F, 20.633F, 7.413F)
            lineTo(20.631F, 7.412F)
            curveTo(20.511F, 7.694F, 20.198F, 7.851F, 19.894F, 7.77F)
            curveTo(19.589F, 7.688F, 19.397F, 7.396F, 19.434F, 7.091F)
            close()
        }
        path(
            fill = SolidColor(color.color01),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(7.242F, 3.767F)
            moveToRelative(-0.605F, -0.162F)
            arcToRelative(0.626F, 0.626F, 60.0F, true, true, 1.21F, 0.324F)
            arcToRelative(0.626F, 0.626F, 60.0F, true, true, -1.21F, -0.324F)
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
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(6.621F, 3.685F)
            curveTo(5.988F, 6.072F, 6.452F, 7.83F, 7.52F, 9.226F)
            curveTo(8.522F, 10.535F, 10.035F, 11.49F, 11.436F, 12.374F)
            lineTo(11.436F, 12.374F)
            lineTo(11.55F, 12.446F)
            curveTo(13.031F, 13.381F, 14.379F, 14.251F, 15.235F, 15.413F)
            curveTo(16.035F, 16.499F, 16.432F, 17.883F, 15.912F, 19.939F)
            curveTo(15.903F, 19.962F, 15.895F, 19.985F, 15.889F, 20.009F)
            curveTo(15.8F, 20.34F, 15.997F, 20.682F, 16.329F, 20.771F)
            curveTo(16.641F, 20.854F, 16.961F, 20.685F, 17.072F, 20.389F)
            lineTo(17.08F, 20.391F)
            curveTo(17.74F, 17.928F, 17.297F, 16.113F, 16.237F, 14.675F)
            curveTo(15.217F, 13.29F, 13.651F, 12.301F, 12.214F, 11.394F)
            lineTo(12.206F, 11.388F)
            curveTo(10.723F, 10.452F, 9.373F, 9.6F, 8.508F, 8.47F)
            curveTo(7.686F, 7.396F, 7.281F, 6.034F, 7.829F, 3.987F)
            curveTo(7.717F, 4.285F, 7.394F, 4.455F, 7.08F, 4.371F)
            curveTo(6.773F, 4.289F, 6.581F, 3.992F, 6.621F, 3.685F)
            close()
        }
        path(
            fill = SolidColor(color.color01),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(13.871F, 7.457F)
            lineTo(7.578F, 5.771F)
            curveTo(7.574F, 5.31F, 7.631F, 4.805F, 7.761F, 4.248F)
            lineTo(14.263F, 5.99F)
            curveTo(13.858F, 5.882F, 13.442F, 6.122F, 13.334F, 6.527F)
            curveTo(13.225F, 6.932F, 13.466F, 7.349F, 13.871F, 7.457F)
            close()
        }
        path(
            fill = SolidColor(color.color01),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(8.508F, 8.467F)
            curveTo(8.71F, 8.731F, 8.939F, 8.98F, 9.189F, 9.218F)
            lineTo(13.557F, 10.389F)
            curveTo(13.153F, 10.28F, 12.912F, 9.864F, 13.021F, 9.459F)
            curveTo(13.129F, 9.054F, 13.545F, 8.814F, 13.95F, 8.922F)
            lineTo(7.846F, 7.286F)
            curveTo(8.007F, 7.721F, 8.235F, 8.11F, 8.508F, 8.467F)
            close()
        }
        path(
            fill = SolidColor(color.color01),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(14.295F, 14.392F)
            lineTo(10.699F, 13.429F)
            curveTo(11.104F, 13.537F, 11.344F, 13.954F, 11.235F, 14.359F)
            curveTo(11.127F, 14.764F, 10.711F, 15.004F, 10.306F, 14.896F)
            lineTo(15.785F, 16.364F)
            curveTo(15.638F, 16.02F, 15.452F, 15.705F, 15.236F, 15.412F)
            curveTo(14.967F, 15.047F, 14.65F, 14.711F, 14.295F, 14.392F)
            close()
        }
        path(
            fill = SolidColor(color.color01),
            fillAlpha = 1.0F,
            strokeAlpha = 1.0F,
            strokeLineWidth = 0.0F,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4.0F,
            pathFillType = PathFillType.NonZero,
        ) {
            moveTo(16.023F, 19.443F)
            curveTo(16.131F, 18.878F, 16.165F, 18.368F, 16.139F, 17.902F)
            lineTo(9.945F, 16.242F)
            curveTo(10.35F, 16.351F, 10.59F, 16.767F, 10.481F, 17.172F)
            curveTo(10.373F, 17.577F, 9.957F, 17.818F, 9.552F, 17.709F)
            lineTo(16.023F, 19.443F)
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
            moveTo(19.356F, 7.355F)
            lineTo(14.263F, 5.99F)
            curveTo(13.858F, 5.882F, 13.442F, 6.122F, 13.333F, 6.527F)
            curveTo(13.225F, 6.932F, 13.465F, 7.349F, 13.87F, 7.457F)
            lineTo(18.753F, 8.766F)
            curveTo(18.987F, 8.368F, 19.19F, 7.903F, 19.356F, 7.355F)
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
            moveTo(16.6F, 10.635F)
            curveTo(17.0F, 10.469F, 17.378F, 10.255F, 17.725F, 9.975F)
            curveTo(17.658F, 9.93F, 17.583F, 9.895F, 17.501F, 9.873F)
            lineTo(13.95F, 8.922F)
            curveTo(13.545F, 8.814F, 13.129F, 9.054F, 13.021F, 9.459F)
            curveTo(12.912F, 9.864F, 13.152F, 10.28F, 13.557F, 10.389F)
            lineTo(15.634F, 10.945F)
            curveTo(15.97F, 10.864F, 16.293F, 10.763F, 16.6F, 10.635F)
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
            moveTo(7.301F, 13.285F)
            curveTo(6.969F, 13.431F, 6.652F, 13.609F, 6.354F, 13.831F)
            curveTo(6.383F, 13.843F, 6.412F, 13.852F, 6.442F, 13.861F)
            lineTo(10.305F, 14.896F)
            curveTo(10.71F, 15.004F, 11.127F, 14.764F, 11.235F, 14.359F)
            curveTo(11.344F, 13.954F, 11.103F, 13.537F, 10.698F, 13.429F)
            lineTo(8.625F, 12.873F)
            curveTo(8.159F, 12.972F, 7.716F, 13.104F, 7.301F, 13.285F)
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
            moveTo(4.604F, 16.383F)
            curveTo(4.793F, 15.84F, 5.018F, 15.381F, 5.274F, 14.991F)
            lineTo(9.944F, 16.242F)
            curveTo(10.349F, 16.351F, 10.59F, 16.767F, 10.481F, 17.172F)
            curveTo(10.373F, 17.577F, 9.956F, 17.818F, 9.551F, 17.709F)
            lineTo(4.604F, 16.383F)
            close()
        }
    }