package com.kaua.book_system.dto.room.create;

import com.kaua.book_system.enums.Disponibility;

import java.time.LocalTime;

public record RoomCreateRequestDto(
        String name,
        Disponibility disponibility,
        String description,
        int capacityMax,
        LocalTime hourOpen,
        LocalTime hourClose
) {
}
