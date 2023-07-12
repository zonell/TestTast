package com.example.testtask.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testtask.data.model.Events

/**
 * Created by O.Dziuba on 12.07.2023.
 */

@Database(entities = [Events::class], version = 1)
abstract class BootEventDB : RoomDatabase() {
    abstract fun bootDao(): BootEventDao
}