package com.example.testtask.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by O.Dziuba on 12.07.2023.
 */

@Entity(tableName = "boot_event")
class Events(
    @PrimaryKey val id: Long,
    val time: Long
)