package com.example.personagensdisney.listofcharacters.di

import com.example.personagensdisney.listofcharacters.data.datasource.CharacterDataSource
import com.example.personagensdisney.listofcharacters.data.datasource.CharacterDataSourceImpl
import com.example.personagensdisney.listofcharacters.data.mapper.CharacterItemListMapper
import com.example.personagensdisney.listofcharacters.data.remote.service.CharacterService
import com.example.personagensdisney.listofcharacters.data.repository.CharacterRepositoryImpl
import com.example.personagensdisney.listofcharacters.domain.repository.CharacterRepository
import com.google.gson.GsonBuilder
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


internal const val URL = "https://api.disneyapi.dev"
//colocar no buildConfig e coloca no localProperties e pega a variavel no gradle

val appModule = module {

    single {
        GsonBuilder().create()
    }
    single {
        Retrofit.Builder()
            .baseUrl(URL)
            //buildConfig.URL
            .client(get())
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    factory<CharacterRepository> {
        CharacterRepositoryImpl(
            dataSource = CharacterDataSourceImpl(
                service = get<Retrofit>().create(CharacterService::class.java)
            ),
            mapper = CharacterItemListMapper()
        )
    }
}
