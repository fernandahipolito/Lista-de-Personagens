package com.example.personagensdisney.domain.repository

import com.example.personagensdisney.domain.entity.Character

internal interface CharacterRepository {
    suspend fun getAllCharacters():List<Character>
}

//retornar o modelo e nao o dto -> camada de dominio nao pode acessar data