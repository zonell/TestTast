package com.example.testtask.domain.use_case

import com.example.testtask.data.db.BootEventDao
import com.example.testtask.data.model.Events

/**
 * Created by O.Dziuba on 12.07.2023.
 */
class EventsUseCaseImpl(
    private val eventDao: BootEventDao
): IEventsUseCase {
    override suspend fun getBootEvents(): List<Events> {
        return eventDao.getAllEntities()
    }

    override suspend fun setBootsEvents(events: Events) {
        eventDao.insert(events)
    }
}