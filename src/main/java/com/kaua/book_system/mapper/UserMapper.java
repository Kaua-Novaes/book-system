package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.user.UserRequestDto;
import com.kaua.book_system.entity.User;

public class UserMapper {

    public User toEntity(UserRequestDto userRequestDto){
        return new User(
                null,
                userRequestDto.username(),
                userRequestDto.password(),
                userRequestDto.role()
        );
    }

    public UserRequestDto toDto(User user){
        return new UserRequestDto(
                user.getUsername(),
                user.getPassword(),
                user.getRole()
        );
    }
}
