package com.example.personagensdisney

import android.app.Application
import com.example.personagensdisney.listofcharacters.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class ApplicationSession : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ApplicationSession)
            modules(appModule)
        }
    }
}
