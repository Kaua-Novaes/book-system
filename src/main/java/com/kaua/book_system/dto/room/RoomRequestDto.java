package com.kaua.book_system.dto.room;

import com.kaua.book_system.enums.Disponibility;

import java.time.LocalDateTime;

public record RoomRequestDto(
        String name,
        Disponibility disponibility,
        String description,
        int capacityMax,
        LocalDateTime hourOpen,
        LocalDateTime hourClose
) {
}
