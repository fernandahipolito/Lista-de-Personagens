package com.example.personagensdisney.listofcharacters.data.model


data class InfoResponse(
    val totalPages: Int,
    val count: Int,
    val previousPage: String?,
    val nextPage: String?,
)
