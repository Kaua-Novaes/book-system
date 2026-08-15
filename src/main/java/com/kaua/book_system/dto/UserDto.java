package com.kaua.book_system.dto;

import com.kaua.book_system.enums.Roles;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public record UserDto(
        Long id,
        String username,
        String password,
        Roles role
) {
}