package com.example.personagensdisney.listofcharacters.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterResponse(
    @SerialName  ("info") val infoResponse: InfoResponse,
    @SerialName ("data") val dataResponse: DataResponse
)
