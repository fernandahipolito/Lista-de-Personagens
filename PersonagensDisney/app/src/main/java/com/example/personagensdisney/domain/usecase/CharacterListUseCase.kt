package com.example.personagensdisney.domain.usecase

import com.example.personagensdisney.domain.entity.Character
import com.example.personagensdisney.domain.repository.CharacterRepository

internal class GetCharactersListUseCase (private val characterRepository: CharacterRepository) {

    suspend operator fun invoke() : List<Character> {
        return characterRepository.getAllCharacters()
    }
}