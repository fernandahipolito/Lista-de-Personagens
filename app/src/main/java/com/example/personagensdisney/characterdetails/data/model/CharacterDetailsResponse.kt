package com.example.personagensdisney.characterdetails.data.model

internal data class CharacterDetailsResponse (
    val data: List<CharacterDetailsDataResponse>,
    val allies: List<String> = emptyList(),
    val enemies:List<String> = emptyList(),
    val name: String,
    val imageUrl: String
)
