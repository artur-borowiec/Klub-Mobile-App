package pl.klubmobile.klubmobileapp.feature.calendar.data

import pl.klubmobile.klubmobileapp.feature.calendar.domain.repository.EventsRepository

class EventsRepositoryImpl : EventsRepository {

    override fun getEvents() = MockedEvents
}

data class Event(
    val name: String,
    val date: String,
    val url: String,
)
