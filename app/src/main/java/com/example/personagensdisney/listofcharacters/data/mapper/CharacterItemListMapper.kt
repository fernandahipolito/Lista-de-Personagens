package com.example.personagensdisney.listofcharacters.data.mapper

import com.example.personagensdisney.listofcharacters.data.model.CharacterResponse
import com.example.personagensdisney.listofcharacters.data.model.DataResponse
import com.example.personagensdisney.listofcharacters.data.model.InfoResponse
import com.example.personagensdisney.listofcharacters.domain.entity.Character
import com.example.personagensdisney.listofcharacters.domain.entity.Data
import com.example.personagensdisney.listofcharacters.domain.entity.Info


internal class CharacterItemListMapper{
    private fun mapInfoDtoToInfo(response: InfoResponse): Info {
        return Info(
            totalPages = response.totalPages,
            count = response.count,
            previousPage = response.previousPage,
            nextPage = response.nextPage
        )
    }

    private fun mapDataDtoToData(response: DataResponse): Data {
        return Data(
           imageUrl = response.imageUrl,
            name = response.name,
            films = response.films
        )
    }

    private fun mapCharacterDtoToCharacter(response: CharacterResponse): Character {
        return Character(
            info = mapInfoDtoToInfo(response.infoResponse),
            data = mapDataDtoToData(response.dataResponse)
        )
    }

    fun mapCharacterDtoToCharacterList(responseList: List<CharacterResponse>): List<Character> {
        return responseList.map { mapCharacterDtoToCharacter(it) }
    }
}
