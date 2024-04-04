package com.example.personagensdisney.characterdetails.data.model

internal data class CharacterDetailsDataResponse (
    val films: List<String> = emptyList(),
    val shortFilms: List<String> = emptyList(),
    val tvShows: List<String> = emptyList()
)
