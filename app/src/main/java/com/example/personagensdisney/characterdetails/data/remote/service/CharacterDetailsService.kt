package com.example.personagensdisney.characterdetails.data.remote.service

import com.example.personagensdisney.characterdetails.data.model.CharacterDetailsResponse
import retrofit2.http.GET
import retrofit2.http.Path

internal interface CharacterDetailsService {
    @GET("/character/{id}")
    suspend fun getCharacterDetails(
        @Path("id") id: String
    ): CharacterDetailsResponse
}