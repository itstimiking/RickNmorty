package com.example.ricknmorty.network

data class Result(
    val id: Int,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
)