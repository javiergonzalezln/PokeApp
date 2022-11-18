package com.example.pokeapp.models

data class User(
    val name:String = "Your",
    val last:String = "Name",
    val accountNumber:String = "11133344556433443",
    var balance: Double = 12.34,
    val email:String = "someuser@thedomain.com"
)