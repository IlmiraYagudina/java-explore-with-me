package ru.practicum.requests.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.practicum.events.entity.Event;
import ru.practicum.requests.dto.ParticipationRequestDto;
import ru.practicum.requests.entity.ParticipationRequest;
import ru.practicum.users.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-06T17:03:10+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.21 (Amazon.com Inc.)"
)
@Component
public class RequestMapperImpl implements RequestMapper {

    @Override
    public ParticipationRequestDto requestToDto(ParticipationRequest participationRequest) {
        if ( participationRequest == null ) {
            return null;
        }

        ParticipationRequestDto participationRequestDto = new ParticipationRequestDto();

        participationRequestDto.setEvent( participationRequestEventId( participationRequest ) );
        participationRequestDto.setRequester( participationRequestRequesterId( participationRequest ) );
        participationRequestDto.setId( participationRequest.getId() );
        participationRequestDto.setStatus( participationRequest.getStatus() );
        participationRequestDto.setCreated( participationRequest.getCreated() );

        return participationRequestDto;
    }

    private Long participationRequestEventId(ParticipationRequest participationRequest) {
        if ( participationRequest == null ) {
            return null;
        }
        Event event = participationRequest.getEvent();
        if ( event == null ) {
            return null;
        }
        Long id = event.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long participationRequestRequesterId(ParticipationRequest participationRequest) {
        if ( participationRequest == null ) {
            return null;
        }
        User requester = participationRequest.getRequester();
        if ( requester == null ) {
            return null;
        }
        Long id = requester.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
