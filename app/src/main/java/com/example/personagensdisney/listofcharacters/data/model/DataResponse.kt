package com.example.personagensdisney.listofcharacters.data.model

data class DataResponse(
    val imageUrl: String?,
    val name: String,
    val films: List<String>
)
