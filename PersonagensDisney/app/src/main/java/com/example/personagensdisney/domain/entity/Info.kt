package com.example.personagensdisney.domain.entity

internal data class Info (
    val totalPages: Int,
    val count: Int,
    val previousPage: String,
    val nextPage: String
)