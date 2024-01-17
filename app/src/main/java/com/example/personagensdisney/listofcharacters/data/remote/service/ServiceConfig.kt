package com.example.personagensdisney.listofcharacters.data.remote.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object ServiceConfig {
    private fun getHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    fun createClient(): OkHttpClient {
        return OkHttpClient().newBuilder().addInterceptor(getHttpLoggingInterceptor()).build()
    }
}