package com.example.personagensdisney

import android.app.Application
import com.example.personagensdisney.listofcharacters.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class ApplicationSession : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ApplicationSession)
            modules(appModule)
        }
    }
}