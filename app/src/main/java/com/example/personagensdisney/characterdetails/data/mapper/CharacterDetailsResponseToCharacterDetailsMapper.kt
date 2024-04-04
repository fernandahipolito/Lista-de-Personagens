package com.example.personagensdisney.characterdetails.data.mapper

import com.example.personagensdisney.characterdetails.data.model.CharacterDetailsDataResponse
import com.example.personagensdisney.characterdetails.data.model.CharacterDetailsResponse
import com.example.personagensdisney.characterdetails.domain.entity.CharacterDetails
import com.example.personagensdisney.characterdetails.domain.entity.CharacterDetailsData

internal class CharacterDetailsResponseToCharacterDetailsMapper {
    private fun mapCharacterDetailsDataResponseToCharacterDetailsData(
        response: CharacterDetailsDataResponse
    ): CharacterDetailsData {
        return CharacterDetailsData(
            films = response.films,
            shortFilms = response.shortFilms,
            tvShows = response.tvShows
        )
    }

    fun mapCharacterDetailsResponseToCharacterDetails(response: CharacterDetailsResponse): CharacterDetails {
        return CharacterDetails(
            data = response.data.map { mapCharacterDetailsDataResponseToCharacterDetailsData(it) },
            allies = response.allies,
            enemies = response.enemies,
            name = response.name,
            imageUrl = response.imageUrl
        )
    }
}