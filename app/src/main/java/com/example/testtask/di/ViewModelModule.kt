package com.example.testtask.di

import com.example.testtask.presentation.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by O.Dziuba on 12.07.2023.
 */

val viewModelModule = module {
    viewModel {
        HomeViewModel(get())
    }
}