package com.example.testtask

import android.app.Application
import com.example.testtask.di.appModule
import com.example.testtask.di.dataBaseModule
import com.example.testtask.di.useCaseModule
import com.example.testtask.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

/**
 * Created by O.Dziuba on 12.07.2023.
 */
class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin{
            androidLogger()
            androidContext(this@Application)
            modules(provideModules())
        }
    }

    private fun provideModules() = listOf(dataBaseModule, viewModelModule, useCaseModule, appModule)
}