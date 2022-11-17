package com.example.pokeapp.ui.viewmodels

import androidx.lifecycle.*
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pokeapp.models.Pokemon
import com.example.pokeapp.repository.PokeRepository
import kotlinx.coroutines.launch

class PokemonViewModel(private val pokeRepository: PokeRepository):ViewModel() {
    //States
    private val _pokemon = MutableLiveData<Pokemon?>()
    val pokemon:LiveData<Pokemon?> get() = _pokemon

    fun getPokemon(name:String){
        viewModelScope.launch {
            _pokemon.value = pokeRepository.getPokemon(name)
        }
    }
}

class PokemonViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PokemonViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PokemonViewModel(PokeRepository()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}