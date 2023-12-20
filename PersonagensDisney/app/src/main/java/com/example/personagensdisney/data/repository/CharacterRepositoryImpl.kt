package com.example.personagensdisney.data.repository

import com.example.personagensdisney.data.datasource.CharacterDataSource
import com.example.personagensdisney.data.mapper.CharacterItemListMapper
import com.example.personagensdisney.domain.entity.Character
import com.example.personagensdisney.domain.repository.CharacterRepository

internal class CharacterRepositoryImpl (
    private val dataSource:CharacterDataSource,
    private val mapper: CharacterItemListMapper
) : CharacterRepository {
    override suspend fun getAllCharacters(): List<Character> {
        return mapper.mapCharacterDtoToCharacterList(dataSource.getAllCharacters())
    }
}