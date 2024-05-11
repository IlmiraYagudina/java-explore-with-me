package ru.practicum.comments.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.practicum.categories.dto.CategoryDto;
import ru.practicum.categories.entity.Category;
import ru.practicum.comments.dto.CommentDto;
import ru.practicum.comments.dto.NewCommentDto;
import ru.practicum.comments.entity.Comment;
import ru.practicum.events.dto.EventShortDto;
import ru.practicum.events.entity.Event;
import ru.practicum.users.dto.UserShortDto;
import ru.practicum.users.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-11T22:01:55+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.21 (Amazon.com Inc.)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public Comment newCommentDtoToComment(NewCommentDto newCommentDto) {
        if ( newCommentDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setText( newCommentDto.getText() );

        return comment;
    }

    @Override
    public CommentDto commentToCommentDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDto commentDto = new CommentDto();

        commentDto.setText( comment.getText() );
        commentDto.setCreatedOn( comment.getCreatedOn() );
        commentDto.setUser( userToUserShortDto( comment.getUser() ) );
        commentDto.setEvent( eventToEventShortDto( comment.getEvent() ) );

        return commentDto;
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

    protected CategoryDto categoryToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto.CategoryDtoBuilder<?, ?> categoryDto = CategoryDto.builder();

        categoryDto.name( category.getName() );
        categoryDto.id( category.getId() );

        return categoryDto.build();
    }

    protected EventShortDto eventToEventShortDto(Event event) {
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
}
