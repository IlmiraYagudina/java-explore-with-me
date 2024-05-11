package ru.practicum.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.practicum.RequestDTO;
import ru.practicum.model.App;
import ru.practicum.model.Request;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-10T14:46:55+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.21 (Amazon.com Inc.)"
)
@Component
public class StatisticsMapperImpl implements StatisticsMapper {

    @Override
    public RequestDTO toRequestDto(Request request) {
        if ( request == null ) {
            return null;
        }

        RequestDTO.RequestDTOBuilder requestDTO = RequestDTO.builder();

        requestDTO.app( requestAppName( request ) );
        requestDTO.id( request.getId() );
        requestDTO.uri( request.getUri() );
        requestDTO.ip( request.getIp() );
        requestDTO.timestamp( request.getTimestamp() );

        return requestDTO.build();
    }

    @Override
    public Request toRequest(RequestDTO requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Request request = new Request();

        request.setApp( requestDTOToApp( requestDto ) );
        request.setId( requestDto.getId() );
        request.setUri( requestDto.getUri() );
        request.setIp( requestDto.getIp() );
        request.setTimestamp( requestDto.getTimestamp() );

        return request;
    }

    private String requestAppName(Request request) {
        if ( request == null ) {
            return null;
        }
        App app = request.getApp();
        if ( app == null ) {
            return null;
        }
        String name = app.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected App requestDTOToApp(RequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        App app = new App();

        app.setName( requestDTO.getApp() );

        return app;
    }
}
