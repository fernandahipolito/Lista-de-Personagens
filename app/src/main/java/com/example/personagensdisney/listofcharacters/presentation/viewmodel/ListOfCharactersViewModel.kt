package com.example.personagensdisney.listofcharacters.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.personagensdisney.listofcharacters.domain.usecase.GetCharactersListUseCase
import kotlinx.coroutines.launch

internal class ListOfCharactersViewModel(private val getCharactersListUseCase: GetCharactersListUseCase) :
    ViewModel() {
    private val _characterState = MutableLiveData<ListOfCharactersViewState>()
    val characterState: LiveData<ListOfCharactersViewState> get() = _characterState

    fun getListOfCharacters() {
        viewModelScope.launch {
            try {
                val characters = getCharactersListUseCase()
                _characterState.value = ListOfCharactersViewState.Success(characters)
            } catch (e: Exception) {
                _characterState.value =
                    ListOfCharactersViewState.Error(e.message ?: "Erro desconhecido")
            }
        }
    }
}
