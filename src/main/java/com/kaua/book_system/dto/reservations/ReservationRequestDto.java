package com.kaua.book_system.dto.reservations;

import com.kaua.book_system.entity.Room;
import com.kaua.book_system.entity.User;
import com.kaua.book_system.enums.Disponibility;

import java.time.LocalDateTime;

public record ReservationRequestDto(
        User userId,
        Room roomId,
        LocalDateTime hourStart,
        LocalDateTime hourEnd,
        LocalDateTime execTime,
        Disponibility status
) {


}
