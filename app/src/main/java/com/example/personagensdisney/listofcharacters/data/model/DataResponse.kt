package com.example.personagensdisney.listofcharacters.data.model

import com.google.gson.annotations.SerializedName

data class DataResponse(
    @SerializedName("_id") val id: String,
    val imageUrl: String?,
    val name: String,
    val films: List<String>
)
