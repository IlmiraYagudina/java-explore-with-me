package ru.practicum.compilations.mapper;

import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.practicum.compilations.dto.CompilationDto;
import ru.practicum.compilations.dto.NewCompilationDto;
import ru.practicum.compilations.entity.Compilation;
import ru.practicum.events.mapper.EventMapper;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-10T14:47:01+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.21 (Amazon.com Inc.)"
)
@Component
public class CompilationMapperImpl implements CompilationMapper {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public Compilation newCompilationDtoToCompilation(NewCompilationDto compilationDto) {
        if ( compilationDto == null ) {
            return null;
        }

        Compilation compilation = new Compilation();

        compilation.setPinned( compilationDto.getPinned() );
        compilation.setTitle( compilationDto.getTitle() );

        return compilation;
    }

    @Override
    public CompilationDto compilationToCompilationDto(Compilation compilation) {
        if ( compilation == null ) {
            return null;
        }

        CompilationDto compilationDto = new CompilationDto();

        if ( compilation.getId() != null ) {
            compilationDto.setId( compilation.getId().intValue() );
        }
        compilationDto.setEvents( eventMapper.listEventToSetEventShortDto( compilation.getEvents() ) );
        compilationDto.setPinned( compilation.getPinned() );
        compilationDto.setTitle( compilation.getTitle() );

        return compilationDto;
    }
}
