package com.kaua.book_system.dto;

import com.kaua.book_system.enums.Disponibility;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record RoomDto(
        Long id,
        String name,
        Disponibility disponibility,
        String description,
        int capacityMax,
        LocalDateTime hourOpen,
        LocalDateTime hourClose
) {
}
