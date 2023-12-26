package com.example.personagensdisney.data.datasource

import com.example.personagensdisney.data.model.CharacterResponse
import com.example.personagensdisney.data.remote.service.CharacterService

internal class CharacterDataSourceImpl(private val service: CharacterService) : CharacterDataSource {
    override suspend fun getAllCharacters(): List<CharacterResponse> {
        return service.getAllCharacters()
    }
}
