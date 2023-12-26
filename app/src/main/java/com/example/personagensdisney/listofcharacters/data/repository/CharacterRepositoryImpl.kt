package com.example.personagensdisney.listofcharacters.data.repository

import com.example.personagensdisney.listofcharacters.data.datasource.CharacterDataSource
import com.example.personagensdisney.listofcharacters.data.mapper.CharacterItemListMapper
import com.example.personagensdisney.listofcharacters.domain.entity.Character
import com.example.personagensdisney.listofcharacters.domain.repository.CharacterRepository

internal class CharacterRepositoryImpl (
    private val dataSource: CharacterDataSource,
    private val mapper: CharacterItemListMapper
) : CharacterRepository {
    override suspend fun getAllCharacters(): List<Character> {
        return mapper.mapCharacterDtoToCharacterList(dataSource.getAllCharacters())
    }
}