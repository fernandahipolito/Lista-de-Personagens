package com.example.personagensdisney.listofcharacters.presentation.viewmodel

import com.example.personagensdisney.listofcharacters.domain.entity.Character

sealed class ListOfCharactersViewState {
    data class Success(val characters: List<Character>) : ListOfCharactersViewState()
    data class Error(val errorMessage: String) : ListOfCharactersViewState()
}
