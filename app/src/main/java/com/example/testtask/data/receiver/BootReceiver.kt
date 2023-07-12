package com.example.testtask.data.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.testtask.data.model.Events
import com.example.testtask.domain.use_case.IEventsUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by O.Dziuba on 12.07.2023.
 */
class BootReceiver(
    private val eventsUseCaseImpl: IEventsUseCase
) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            CoroutineScope(Dispatchers.IO).launch {
                eventsUseCaseImpl.setBootsEvents(Events(1, System.currentTimeMillis()))
            }
        }
    }
}
