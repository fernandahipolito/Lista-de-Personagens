package com.example.personagensdisney.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InfoResponse(
    @SerialName("totalPages") val totalPages: Int,
    @SerialName("count") val count: Int,
    @SerialName("previousPage") val previousPage: String,
    @SerialName("nextPage") val nextPage: String,
)
