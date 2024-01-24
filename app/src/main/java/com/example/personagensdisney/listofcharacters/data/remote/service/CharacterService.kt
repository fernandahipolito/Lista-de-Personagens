package com.example.personagensdisney.listofcharacters.data.remote.service

import com.example.personagensdisney.listofcharacters.data.model.CharacterResponse
import retrofit2.http.GET

internal interface CharacterService {
    @GET("/character")
    suspend fun getAllCharacters(): CharacterResponse

}

