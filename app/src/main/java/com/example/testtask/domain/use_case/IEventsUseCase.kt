package com.example.testtask.domain.use_case

import com.example.testtask.data.model.Events

/**
 * Created by O.Dziuba on 12.07.2023.
 */
interface IEventsUseCase {
    suspend fun getBootEvents(): List<Events>
    suspend fun setBootsEvents(events: Events)
}