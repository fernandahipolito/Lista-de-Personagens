package com.example.personagensdisney.listofcharacters.domain.entity

data class Info (
    val totalPages: Int,
    val count: Int,
    val previousPage: String,
    val nextPage: String
)