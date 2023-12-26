package com.example.personagensdisney.listofcharacters.data.datasource

import com.example.personagensdisney.listofcharacters.data.model.CharacterResponse
import com.example.personagensdisney.listofcharacters.data.remote.service.CharacterService

internal class CharacterDataSourceImpl(private val service: CharacterService) :
    CharacterDataSource {
    override suspend fun getAllCharacters(): List<CharacterResponse> {
        return service.getAllCharacters()
    }
}
