package ru.practicum.users.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.practicum.users.dto.NewUserDto;
import ru.practicum.users.dto.UserDto;
import ru.practicum.users.dto.UserShortDto;
import ru.practicum.users.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-07T23:43:57+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.21 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDtoToUser(NewUserDto newUserRequestDto) {
        if ( newUserRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( newUserRequestDto.getEmail() );
        user.setName( newUserRequestDto.getName() );

        return user;
    }

    @Override
    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setEmail( user.getEmail() );
        userDto.setName( user.getName() );

        return userDto;
    }

    @Override
    public UserShortDto userToUserShortDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserShortDto userShortDto = new UserShortDto();

        userShortDto.setId( user.getId() );
        userShortDto.setName( user.getName() );

        return userShortDto;
    }
}
