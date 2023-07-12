package com.example.testtask.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.testtask.data.model.Events

/**
 * Created by O.Dziuba on 12.07.2023.
 */

@Dao
interface BootEventDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: Events)

    @Query("SELECT * FROM boot_event")
    suspend fun getAllEntities(): List<Events>
}