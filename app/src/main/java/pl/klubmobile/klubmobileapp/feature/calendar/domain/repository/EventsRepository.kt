package pl.klubmobile.klubmobileapp.feature.calendar.domain.repository

import kotlinx.coroutines.flow.Flow
import pl.klubmobile.klubmobileapp.feature.calendar.data.Event

interface EventsRepository {

    fun getEvents(): Flow<List<Event>>
}