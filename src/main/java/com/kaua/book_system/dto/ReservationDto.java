package com.kaua.book_system.dto;

import com.kaua.book_system.entity.Room;
import com.kaua.book_system.entity.User;
import com.kaua.book_system.enums.Disponibility;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ReservationDto(
        Long id,
        User userId,
        Room roomId,
        LocalDateTime hourStart,
        LocalDateTime hourEnd,
        LocalDateTime execTime,
        Disponibility status
) {


}
