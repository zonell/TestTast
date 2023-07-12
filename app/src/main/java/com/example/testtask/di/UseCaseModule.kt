package com.example.testtask.di

import com.example.testtask.domain.use_case.EventsUseCaseImpl
import com.example.testtask.domain.use_case.IEventsUseCase
import org.koin.dsl.module

/**
 * Created by O.Dziuba on 12.07.2023.
 */

val useCaseModule = module {
    factory<IEventsUseCase> { EventsUseCaseImpl(get()) }

}