package com.kaua.book_system.dto.user;

import com.kaua.book_system.enums.Roles;

public record UserResponseDto(
        Long id,
        String username
) {
}
