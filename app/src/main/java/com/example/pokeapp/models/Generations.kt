package com.example.pokeapp.models

import com.squareup.moshi.Json

class GenerationI(
    @Json(name="red-blue")val redBlue:RedBlue,
    val yellow:Yellow
)
class RedBlue(
    @Json(name="back_default")val backDefault : String?,
    @Json(name="back_gray")val backGray : String?,
    @Json(name="back_transparent")val backTransparent : String?,
    @Json(name="front_default")val frontDefault : String?,
    @Json(name="front_gray")val frontGray : String?,
    @Json(name="front_transparent")val frontTransparent : String?
)
class Yellow(
    @Json(name="back_default")val backDefault : String?,
    @Json(name="back_gray")val backGray : String?,
    @Json(name="back_transparent")val backTransparent : String?,
    @Json(name="front_default")val frontDefault : String?,
    @Json(name="front_gray")val frontGray : String?,
    @Json(name="front_transparent")val frontTransparent : String?
)

class GenerationII(
    val crystal:Crystal,
    val gold:Gold,
    val silver:Silver
)
class Crystal(
    @Json(name="back_default")val backDefault : String?,
    @Json(name="back_shiny")val backShiny : String?,
    @Json(name="back_shiny_transparent")val backShinyTransparent : String?,
    @Json(name="back_transparent")val backTransparent : String?,
    @Json(name="front_default")val frontDefault : String?,
    @Json(name="front_shiny")val frontShiny : String?,
    @Json(name="front_shiny_transparent")val frontShinyTransparent : String?,
    @Json(name="front_transparent")val frontTransparent : String?,
)
class Gold(
    @Json(name="back_default")val backDefault : String?,
    @Json(name="back_shiny")val backShiny : String?,
    @Json(name="front_default")val frontDefault : String?,
    @Json(name="front_shiny")val frontShiny : String?,
    @Json(name="front_transparent")val frontTransparent : String?,
)
class Silver(
    @Json(name="back_default")val backDefault : String?,
    @Json(name="back_shiny")val backShiny : String?,
    @Json(name="front_default")val frontDefault : String?,
    @Json(name="front_shiny")val frontShiny : String?,
    @Json(name="front_transparent")val frontTransparent : String?,
)

class GenerationIII(
    val emerald:Emerald,
    @Json(name="firered-leafgreen")val fireredLeafgreen:FireredLeafgreen,
    @Json(name="ruby-sapphire")val ruby_sapphire:RubySapphire
)
class Emerald(
    val front_default : String?,
    val front_shiny : String?,
)
class FireredLeafgreen(
    val back_default : String?,
    val back_shiny : String?,
    val front_default : String?,
    val front_shiny : String?,
)
class RubySapphire(
    val back_default : String?,
    val back_shiny : String?,
    val front_default : String?,
    val front_shiny : String?,
)

class GenerationIV(
    @Json(name="diamond-pearl")val diamond_pearl:DiamondPearl,
    @Json(name="heartgold-soulsilver")val heartgold_soulsilver:HeartgoldSoulsilver,
    val platinum:Platinum
)
class DiamondPearl(
    val back_default : String?,
    val back_female : String?,
    val back_shiny : String?,
    val back_shiny_female : String?,
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)
class HeartgoldSoulsilver(
    val back_default : String?,
    val back_female : String?,
    val back_shiny : String?,
    val back_shiny_female : String?,
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)
class Platinum(
    val back_default : String?,
    val back_female : String?,
    val back_shiny : String?,
    val back_shiny_female : String?,
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)

class GenerationV(
    @Json(name="black-white")val black_white:BlackWhite
)
class BlackWhite(
    val animated:Animated,
    val back_default : String?,
    val back_female : String?,
    val back_shiny : String?,
    val back_shiny_female : String?,
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)
class Animated(
    val back_default : String?,
    val back_female : String?,
    val back_shiny : String?,
    val back_shiny_female : String?,
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)

class GenerationVI(
    @Json(name="omegaruby-alphasapphire")val omegaruby_alphasapphire:OmegarubyAlphasapphire,
    @Json(name="x-y")val x_y:XY
)
class OmegarubyAlphasapphire(
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)
class XY(
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)

class GenerationVII(
    val icons:Icons,
    @Json(name="ultra-sun-ultra-moon")val ultra_sun_ultra_moon:UltraSunUltraMoon

)
class Icons(
    val front_default : String?,
    val front_female : String?,
)
class UltraSunUltraMoon(
    val front_default : String?,
    val front_female : String?,
    val front_shiny : String?,
    val front_shiny_female : String?,
)

class GenerationVIII(
    val icons:Icons,
)