package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.user.UserRequestDto;
import com.kaua.book_system.dto.user.UserResponseDto;
import com.kaua.book_system.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserRequestDto userRequestDto){
        return new User(
                null,
                userRequestDto.username(),
                userRequestDto.password(),
                userRequestDto.role()
        );
    }

    public UserResponseDto toDto(User user){
        return new UserResponseDto(
                user.getId(),
                user.getUsername()
        );
    }
}
