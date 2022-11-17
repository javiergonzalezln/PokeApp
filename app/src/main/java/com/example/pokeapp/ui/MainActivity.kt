package com.example.pokeapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.pokeapp.R
import com.example.pokeapp.ui.viewmodels.PokemonViewModel
import com.example.pokeapp.ui.viewmodels.PokemonViewModelFactory
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    //ViewModels
    private lateinit var pokemonViewModel: PokemonViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup(){
        val pokemonViewModelFactory = PokemonViewModelFactory()
        pokemonViewModel = ViewModelProvider(this,pokemonViewModelFactory)[PokemonViewModel::class.java]

        observePokemonViewModel()
        val searchButton = findViewById<Button>(R.id.search)
        val editText = findViewById<EditText>(R.id.editText)

        searchButton.setOnClickListener {
            val text = editText.text.toString()
            pokemonViewModel.getPokemon(text)
        }
    }
    private fun observePokemonViewModel(){
        pokemonViewModel.pokemon.observe(this){
            if(it==null){
                //Show message the pokemon doesnt exits
                Toast.makeText(this,"There is no pokemon with that name",Toast.LENGTH_SHORT).show()
            }else{
                //Show the way the user can buy it
                Toast.makeText(this,it.name,Toast.LENGTH_SHORT).show()
            }
        }
    }
}