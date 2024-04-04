package com.example.personagensdisney.characterdetails.domain.entity

internal data class CharacterDetails (
    val data: List<CharacterDetailsData>,
    val allies: List<String> = emptyList(),
    val enemies:List<String> = emptyList(),
    val name: String,
    val imageUrl: String
)