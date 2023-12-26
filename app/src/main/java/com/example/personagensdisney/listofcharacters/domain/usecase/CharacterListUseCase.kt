package com.example.personagensdisney.listofcharacters.domain.usecase

import com.example.personagensdisney.listofcharacters.domain.entity.Character
import com.example.personagensdisney.listofcharacters.domain.repository.CharacterRepository

internal class GetCharactersListUseCase (private val characterRepository: CharacterRepository) {

    suspend operator fun invoke() : List<Character> {
        return characterRepository.getAllCharacters()
    }
}