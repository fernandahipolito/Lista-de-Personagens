package com.example.personagensdisney.listofcharacters.di

import com.example.personagensdisney.BuildConfig
import com.example.personagensdisney.listofcharacters.data.datasource.CharacterDataSourceImpl
import com.example.personagensdisney.listofcharacters.data.mapper.CharacterItemListMapper
import com.example.personagensdisney.listofcharacters.data.remote.service.CharacterService
import com.example.personagensdisney.listofcharacters.data.remote.service.ServiceConfig
import com.example.personagensdisney.listofcharacters.data.repository.CharacterRepositoryImpl
import com.example.personagensdisney.listofcharacters.domain.repository.CharacterRepository
import com.example.personagensdisney.listofcharacters.domain.usecase.GetCharactersListUseCase
import com.example.personagensdisney.listofcharacters.presentation.viewmodel.ListOfCharactersViewModel
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//colocar no buildConfig e coloca no localProperties e pega a variavel no gradle

val appModule = module {

    single {
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(ServiceConfig.createClient())
            .addConverterFactory(GsonConverterFactory.create())
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

    factory { GetCharactersListUseCase(get()) }
    viewModel { ListOfCharactersViewModel(get()) }
}
