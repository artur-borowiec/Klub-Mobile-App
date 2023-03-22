package pl.klubmobile.klubmobileapp.feature.calendar.domain

import pl.klubmobile.klubmobileapp.feature.calendar.data.Event

interface GetEventsUseCase {
    operator fun invoke(): List<Event>
}
