package dev.cancio.pokemon.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val black01 = Color(0xFF5F5F5F)
val black02 = Color(0xFF323131)
val black03 = Color(0xFF282828)
val blue01 = Color(0xFF51ABFF)
val blue02 = Color(0xFF0066FF)
val blue03 = Color(0xFF0057DA)
val brown01 = Color(0xFFDC714F)
val brown02 = Color(0xFFAB5438)
val brown03 = Color(0xFF9B4C33)
val grey01 = Color(0xFF999999)
val grey02 = Color(0xFF787878)
val grey03 = Color(0xFF6A6869)
val green01 = Color(0xFF4FF474)
val green02 = Color(0xFF12CA50)
val green03 = Color(0xFF40B969)
val pink01 = Color(0xFFFE699E)
val pink02 = Color(0xFFDC487E)
val pink03 = Color(0xFFCE4778)
val purple01 = Color(0xFFE241E9)
val purple02 = Color(0xFFC82BCF)
val purple03 = Color(0xFFB22DB8)
val red01 = Color(0xFFFF7E7E)
val red02 = Color(0xFFE43333)
val red03 = Color(0xFFCB3131)
val white01 = Color(0xFFB3DFDF)
val white02 = Color(0xFF9CC1C1)
val white03 = Color(0xFF91B0B0)
val yellow01 = Color(0xFFFFD205)
val yellow02 = Color(0xFFFAA019)
val yellow03 = Color(0xFFEC9718)

enum class ColorPallet(
    val color01: Color = black01,
    val color02: Color = black02,
    val color03: Color = black03
) {
    Black(black01, black02, black03),
    Blue(blue01, blue02, blue03),
    Brown(brown01, brown02, brown03),
    Grey(grey01, grey02, grey03),
    Green(green01, green02, green03),
    Pink(pink01, pink02, pink03),
    Purple(purple01, purple02, purple03),
    Red(red01, red02, red03),
    White(white01, white02, white03),
    Yellow(yellow01, yellow02, yellow03)
}