package com.example.personagensdisney.listofcharacters.presentation.viewmodel

import com.example.personagensdisney.listofcharacters.domain.entity.Character
import com.example.personagensdisney.listofcharacters.domain.entity.Data

sealed class ListOfCharactersViewState {
    data class Success(val data: List<Data>) : ListOfCharactersViewState()
    //List<data>
    data class Error(val errorMessage: String) : ListOfCharactersViewState()
}
