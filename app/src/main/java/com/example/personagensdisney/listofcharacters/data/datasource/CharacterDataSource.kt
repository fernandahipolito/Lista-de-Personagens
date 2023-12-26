package com.example.personagensdisney.listofcharacters.data.datasource

import com.example.personagensdisney.listofcharacters.data.model.CharacterResponse

internal interface CharacterDataSource {
    suspend fun getAllCharacters() : List<CharacterResponse>
}