package pl.klubmobile.klubmobileapp.feature.calendar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.klubmobile.klubmobileapp.feature.calendar.data.Event
import pl.klubmobile.klubmobileapp.feature.calendar.data.MockedEvents
import pl.klubmobile.klubmobileapp.feature.calendar.data.usecase.GetEventsUseCaseImpl

@Composable
fun EventsPage(
    viewModel: EventsViewModel = EventsViewModel(GetEventsUseCaseImpl()),
) {
    val events = viewModel.events.collectAsState()
    EventsList(events.value)
}

@Composable
private fun EventsList(events: List<Event>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(events) { event ->
            Card() {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(event.name)
                    Text(
                        event.date,
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun EventsListPreview() {
    EventsList(MockedEvents)
}
