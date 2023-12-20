package com.example.personagensdisney.data.remote.service

import com.example.personagensdisney.data.model.CharacterResponse
import retrofit2.http.GET


internal interface CharacterService {
    @GET("/character")
    suspend fun getAllCharacters():List<CharacterResponse>
}

