package com.example.pokeapp.ui

import android.graphics.Color
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.pokeapp.R
import com.example.pokeapp.ui.viewmodels.PokemonViewModel
import com.example.pokeapp.ui.viewmodels.PokemonViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

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

        val searchB = findViewById<Button>(R.id.search_button)
        val searchET = findViewById<TextInputEditText>(R.id.search_et)

        searchB.setOnClickListener {
            val text = searchET.text.toString()
            pokemonViewModel.getPokemon(text)
        }
    }
    private fun observePokemonViewModel(){
        pokemonViewModel.pokemon.observe(this){
            if(it==null){
                //Show message the pokemon doesn't exit
                emptyTV.isVisible = true
                name_LL.isVisible = false
                experience_LL.isVisible = false
                height_LL.isVisible = false
                weight_LL.isVisible = false
                price_LL.isVisible = false
            }else{
                //Update the views with the right values
                emptyTV.isVisible = false
                name_LL.isVisible = true
                experience_LL.isVisible = true
                height_LL.isVisible = true
                weight_LL.isVisible = true
                price_LL.isVisible = true

                nameTV.text = it.name
                experienceTV.text = it.base_experience.toString()
                heightTV.text = it.height.toString()
                weight_TV.text = it.weight.toString()
                price_TV.text = "$${it.price}"
                if(pokemonViewModel.user.value!=null){
                    if(pokemonViewModel.user.value!!.balance >= it.price){
                        buy.isEnabled = true
                        user_balance.setTextColor(Color.BLACK)
                    }else{
                        buy.isEnabled = false
                        user_balance.setTextColor(Color.RED)
                    }
                }
            }
        }
        pokemonViewModel.user.observe(this){
            it?.let{
                val userBalance = findViewById<TextView>(R.id.user_balance)
                userBalance.text = "$${it.balance}"
            }
        }
    }
}