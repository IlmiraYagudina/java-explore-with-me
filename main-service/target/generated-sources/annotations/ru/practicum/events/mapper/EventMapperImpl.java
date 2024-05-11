package ru.practicum.events.mapper;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.practicum.categories.dto.CategoryDto;
import ru.practicum.categories.entity.Category;
import ru.practicum.events.dto.EventFullDto;
import ru.practicum.events.dto.EventShortDto;
import ru.practicum.events.dto.NewEventDto;
import ru.practicum.events.entity.Event;
import ru.practicum.users.dto.UserShortDto;
import ru.practicum.users.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-11T22:01:55+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.21 (Amazon.com Inc.)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public EventFullDto eventToEventFullDto(Event event) {
        if ( event == null ) {
            return null;
        }

        EventFullDto eventFullDto = new EventFullDto();

        eventFullDto.setId( event.getId() );
        eventFullDto.setTitle( event.getTitle() );
        eventFullDto.setAnnotation( event.getAnnotation() );
        eventFullDto.setCategory( categoryToCategoryDto( event.getCategory() ) );
        eventFullDto.setConfirmedRequests( event.getConfirmedRequests() );
        eventFullDto.setCreatedOn( event.getCreatedOn() );
        eventFullDto.setDescription( event.getDescription() );
        eventFullDto.setEventDate( event.getEventDate() );
        eventFullDto.setInitiator( userToUserShortDto( event.getInitiator() ) );
        eventFullDto.setLocation( event.getLocation() );
        eventFullDto.setPaid( event.getPaid() );
        eventFullDto.setParticipantLimit( event.getParticipantLimit() );
        eventFullDto.setPublishedOn( event.getPublishedOn() );
        eventFullDto.setRequestModeration( event.getRequestModeration() );
        eventFullDto.setState( event.getState() );
        eventFullDto.setViews( event.getViews() );

        return eventFullDto;
    }

    @Override
    public EventShortDto eventToShortDto(Event event) {
        if ( event == null ) {
            return null;
        }

        EventShortDto eventShortDto = new EventShortDto();

        eventShortDto.setAnnotation( event.getAnnotation() );
        eventShortDto.setId( event.getId() );
        eventShortDto.setCategory( categoryToCategoryDto( event.getCategory() ) );
        eventShortDto.setConfirmedRequests( event.getConfirmedRequests() );
        eventShortDto.setEventDate( event.getEventDate() );
        eventShortDto.setInitiator( userToUserShortDto( event.getInitiator() ) );
        eventShortDto.setPaid( event.getPaid() );
        eventShortDto.setTitle( event.getTitle() );
        eventShortDto.setViews( event.getViews() );

        return eventShortDto;
    }

    @Override
    public Event newEventDtoToEvent(NewEventDto eventDto) {
        if ( eventDto == null ) {
            return null;
        }

        Event event = new Event();

        event.setAnnotation( eventDto.getAnnotation() );
        event.setDescription( eventDto.getDescription() );
        event.setEventDate( eventDto.getEventDate() );
        event.setLocation( eventDto.getLocation() );
        event.setPaid( eventDto.getPaid() );
        if ( eventDto.getParticipantLimit() != null ) {
            event.setParticipantLimit( eventDto.getParticipantLimit().longValue() );
        }
        event.setRequestModeration( eventDto.getRequestModeration() );
        event.setTitle( eventDto.getTitle() );

        return event;
    }

    @Override
    public Set<EventShortDto> listEventToSetEventShortDto(List<Event> events) {
        if ( events == null ) {
            return null;
        }

        Set<EventShortDto> set = new LinkedHashSet<EventShortDto>( Math.max( (int) ( events.size() / .75f ) + 1, 16 ) );
        for ( Event event : events ) {
            set.add( eventToShortDto( event ) );
        }

        return set;
    }

    protected CategoryDto categoryToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto.CategoryDtoBuilder<?, ?> categoryDto = CategoryDto.builder();

        categoryDto.name( category.getName() );
        categoryDto.id( category.getId() );

        return categoryDto.build();
    }

    protected UserShortDto userToUserShortDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserShortDto userShortDto = new UserShortDto();

        userShortDto.setId( user.getId() );
        userShortDto.setName( user.getName() );

        return userShortDto;
    }
}
