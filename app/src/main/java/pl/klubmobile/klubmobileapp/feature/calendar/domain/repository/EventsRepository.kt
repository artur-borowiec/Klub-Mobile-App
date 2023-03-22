package pl.klubmobile.klubmobileapp.feature.calendar.domain.repository

import pl.klubmobile.klubmobileapp.feature.calendar.data.Event

interface EventsRepository {

    fun getEvents(): List<Event>
}