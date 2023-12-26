package com.example.personagensdisney.data.datasource

import com.example.personagensdisney.data.model.CharacterResponse

internal interface CharacterDataSource {
    suspend fun getAllCharacters() : List<CharacterResponse>
}