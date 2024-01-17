package com.example.personagensdisney.listofcharacters.domain.entity

data class Data (
    val imageUrl: String,
    val name: String,
    val films: List<String>
) {
    fun getTop3Films() = films.take(3).joinToString()
}
