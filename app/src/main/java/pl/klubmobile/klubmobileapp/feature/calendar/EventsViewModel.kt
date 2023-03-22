package pl.klubmobile.klubmobileapp.feature.calendar

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import pl.klubmobile.klubmobileapp.feature.calendar.data.Event
import pl.klubmobile.klubmobileapp.feature.calendar.data.usecase.GetEventsUseCaseImpl
import pl.klubmobile.klubmobileapp.feature.calendar.domain.GetEventsUseCase

class EventsViewModel(
    private val getEventsUseCase: GetEventsUseCase = GetEventsUseCaseImpl()
): ViewModel() {

    val events = MutableStateFlow(listOf<Event>())

    init {
        getEvents()
    }

    private fun getEvents() {
        events.value = getEventsUseCase.invoke()
    }
}