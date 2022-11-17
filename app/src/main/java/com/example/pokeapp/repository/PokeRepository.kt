package com.example.pokeapp.repository

import com.example.pokeapp.api.Network
import com.example.pokeapp.models.Pokemon
import java.lang.Exception

class PokeRepository {

    suspend fun getPokemon(name:String): Pokemon? {
        return try {
            val pokemon:Pokemon = Network.pokemons.getPokemon(name)
            pokemon
        }catch (e: Exception){
            null
        }
    }
}