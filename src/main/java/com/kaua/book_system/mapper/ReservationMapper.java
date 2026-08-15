package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.reservations.ReservationRequestDto;
import com.kaua.book_system.entity.Reservation;
import com.kaua.book_system.entity.Room;
import com.kaua.book_system.entity.User;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public Reservation toEntity(ReservationRequestDto reservationRequestDto, Room room, User user){
      return new Reservation(
              null,
              user,
              room,
              reservationRequestDto.hourStart(),
              reservationRequestDto.hourEnd(),
              reservationRequestDto.execTime(),
              reservationRequestDto.status()
      );
    };

    public ReservationRequestDto toDto(Reservation reservation){
        return new ReservationRequestDto(
                reservation.getUser(),
                reservation.getRoom(),
                reservation.getHourStart(),
                reservation.getHourEnd(),
                reservation.getExecTime(),
                reservation.getStatus()
        );
    }
}
