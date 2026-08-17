package com.kaua.book_system.dto.room;

import com.kaua.book_system.enums.Disponibility;

import java.time.LocalTime;

public record RoomResponseDto(
        Long id,
        String name,
        Disponibility disponibility,
        String description,
        int capacityMax,
        LocalTime hourOpen,
        LocalTime hourClose
) {

}
