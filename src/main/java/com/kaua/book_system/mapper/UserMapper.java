package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.UserDto;
import com.kaua.book_system.entity.User;

public class UserMapper {

    public User toEntity(UserDto userDto){
        return new User(
                null,
                userDto.username(),
                userDto.password(),
                userDto.role()
        );
    }
}
