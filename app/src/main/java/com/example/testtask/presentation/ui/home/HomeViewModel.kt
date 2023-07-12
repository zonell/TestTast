package com.example.testtask.presentation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testtask.domain.use_case.IEventsUseCase
import kotlinx.coroutines.launch

class HomeViewModel(
    private val eventsUseCase: IEventsUseCase
) : ViewModel() {

    private val _eventLiveData = MutableLiveData<String>()
    val eventLiveData: LiveData<String> = _eventLiveData


    init {
        getEvents()
    }

    private fun getEvents() {
        viewModelScope.launch {
            val events = eventsUseCase.getBootEvents()

            val text = StringBuilder()

            if (events.isEmpty()) {
                text.append("No boots detected")
            } else {
                events.forEach {
                    text.append("${it.id} - ${it.time}\n")
                }
            }

            _eventLiveData.value = text.toString()

        }
    }

}