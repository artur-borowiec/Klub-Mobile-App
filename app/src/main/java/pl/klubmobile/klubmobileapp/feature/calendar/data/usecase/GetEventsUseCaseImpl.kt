package pl.klubmobile.klubmobileapp.feature.calendar.data.usecase

import pl.klubmobile.klubmobileapp.feature.calendar.domain.repository.EventsRepository
import pl.klubmobile.klubmobileapp.feature.calendar.data.EventsRepositoryImpl
import pl.klubmobile.klubmobileapp.feature.calendar.domain.GetEventsUseCase

class GetEventsUseCaseImpl(
    private val repository: EventsRepository = EventsRepositoryImpl()
): GetEventsUseCase {

    operator fun invoke() = repository.getEvents()
}
