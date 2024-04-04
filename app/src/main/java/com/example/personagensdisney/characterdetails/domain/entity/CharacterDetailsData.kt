package com.example.personagensdisney.characterdetails.domain.entity

internal data class CharacterDetailsData (
    val films: List<String> = emptyList(),
    val shortFilms: List<String> = emptyList(),
    val tvShows: List<String> = emptyList()
)
