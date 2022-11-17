package com.example.pokeapp.models

import com.squareup.moshi.Json

class Pokemon (
    val abilities:List<Abilities>,
    val base_experience:Int,
    val forms : List<Form>,
    val game_indices:List<Game>,
    val height:Int,
    val held_items:List<HeldItem>,
    val id:Int,
    val is_default:Boolean,
    val location_area_encounters:String,
    val moves:List<Moves>,
    val name: String,
    val order:Int,
    val past_types:List<PastTypes>,
    val species:Specie,
    val sprites:Sprite,
    val stats:List<Stats>,
    val types:List<Types>,
    val weight:Int
)

class Abilities(
    val ability:Ability,
    val is_hidden:Boolean,
    val slot:Int
    )
class Ability(
    val name: String ="",
    val url: String =""
)
class Form(
    val name: String ="",
    val url: String =""
)
class Game(
    val game_index:Int,
    val version:Version
)
class Version(
    val name: String ="",
    val url: String =""
)
class HeldItem(
    val item:Item,
    val version_details:List<VersionDetail>
)
class Item(
    val name: String ="",
    val url: String =""
)
class VersionDetail(
    val rarity:Int,
    val version: Version
)
class Moves(
    val move:Move,
    val version_group_details:List<VersionGroupDetail>
)
class Move(
    val name: String ="",
    val url: String =""
)
class VersionGroupDetail(
    val level_learned_at:Int,
    val move_learn_method:MoveLearnMethod,
    val version_group:MoveGroup
)
class MoveLearnMethod(
    val name: String ="",
    val url: String =""
)
class MoveGroup(
    val name: String ="",
    val url: String =""
)
class PastTypes()
class Specie(
    val name: String ="",
    val url: String =""
)
class Sprite(
    val back_default : String?,
    val back_female:String?,
    val back_shiny : String?,
    val back_shiny_female:String?,
    val front_default : String?,
    val front_female:String?,
    val front_shiny : String?,
    val front_shiny_female:String?,
    val other:Other,
    val versions:Versions,
)
class Other(
    val dream_world:DreamWorld,
    val home:Home,
    @Json(name="official-artwork")val official_artwork:OfficialArtWork
)
class DreamWorld(
    val front_default : String?,
    val front_female:String?,
)
class Home(
    val front_default : String?,
    val front_female:String?,
    val front_shiny : String?,
    val front_shiny_female:String?
)
class OfficialArtWork(
    val front_default : String?,
)
class Versions(
    @Json(name="generation-i")val generation_i:GenerationI,
    @Json(name="generation-ii")val generation_ii:GenerationII,
    @Json(name="generation-iii")val generation_iii:GenerationIII,
    @Json(name="generation-iv")val generation_iv:GenerationIV,
    @Json(name="generation-v")val generation_v:GenerationV,
    @Json(name="generation-vi")val generation_vi:GenerationVI,
    @Json(name="generation-vii")val generation_vii:GenerationVII,
    @Json(name="generation-viii")val generation_viii:GenerationVIII,
)
class Stats(
    val base_stat:Int,
    val effort:Int,
    val stat:Stat
)
class Stat(
    val name: String ="",
    val url: String =""
)
class Types(
    val slot:Int,
    val type:TypeStat
)
class TypeStat(
    val name: String ="",
    val url: String =""
)



/*
data class CubatelContactModel(@Id var localId: Long = 0,
                               @SerializedName("id") var id: Int,
                               @SerializedName("name") var name: String="",
                               @SerializedName("account") var account: String="",
                               @SerializedName("nautaAccount") var nautaAccount: String?="",
                               @SerializedName("userId") var userId: String="",
                               @SerializedName("phoneContact") var phoneContact: Boolean,
                               @SerializedName("country") var country: String?="",
                               @SerializedName("notes") var notes: String?="",
                               @SerializedName("userAgentType") var userAgentType: Int,
                               @SerializedName("isFavorite") var isFavorite: Boolean,
                               var isLocalContact: Boolean = false,
                               var contactId: String? = ""
                               ) : Parcelable

                               abilities
base_experience : 101
forms
game_indices
height : 3
held_items
id : 132
is_default : true
location_area_encounters : "https://pokeapi.co/api/v2/pokemon/132/encounters"
moves
name : "ditto"
order : 214
past_types
species
sprites
stats
types
weight : 40
 */