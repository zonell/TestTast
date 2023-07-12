package com.example.testtask.di

import androidx.room.Room
import com.example.testtask.data.db.BootEventDB
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Created by O.Dziuba on 12.07.2023.
 */
val dataBaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            BootEventDB::class.java,
            "events_database.db"
        ).build()
    }
    single { get<BootEventDB>().bootDao() }
}