package com.example.testtask.di

import com.example.testtask.data.receiver.BootReceiver
import org.koin.dsl.module

/**
 * Created by O.Dziuba on 12.07.2023.
 */

val appModule = module {
    factory { BootReceiver(get()) }
}