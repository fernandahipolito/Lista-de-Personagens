package com.example.personagensdisney.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DataResponse(
    @SerialName("imageUrl") val imageUrl: String,
    @SerialName("name") val name: String,
    @SerialName("films") val films: List<String>
)
