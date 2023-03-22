package pl.klubmobile.klubmobileapp.feature.calendar.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class EventsRepositoryImpl : EventsRepository {

    override fun getEvents() = flowOf(MockedEvents)
}

interface EventsRepository {

    fun getEvents(): Flow<List<Event>>
}

data class Event(
    val name: String,
    val date: String,
    val url: String,
)
