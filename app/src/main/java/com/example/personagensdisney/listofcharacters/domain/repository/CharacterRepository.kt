package com.example.personagensdisney.listofcharacters.domain.repository

import com.example.personagensdisney.listofcharacters.domain.entity.Character

internal interface CharacterRepository {
    suspend fun getAllCharacters(): Character
}

//retornar o modelo e nao o dto -> camada de dominio nao pode acessar data