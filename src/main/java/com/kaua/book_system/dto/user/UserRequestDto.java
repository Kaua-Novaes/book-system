package com.kaua.book_system.dto.user;

import com.kaua.book_system.enums.Roles;

public record UserRequestDto(
        String username,
        String password,
        Roles role
) {
}