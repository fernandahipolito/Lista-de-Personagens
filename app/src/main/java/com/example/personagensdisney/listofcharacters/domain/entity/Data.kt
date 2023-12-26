package com.example.personagensdisney.listofcharacters.domain.entity

internal data class Data (
    val imageUrl: String,
    val name: String,
    val films: List<String>
)