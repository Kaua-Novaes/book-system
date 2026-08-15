package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.ReservationDto;
import com.kaua.book_system.dto.RoomDto;
import com.kaua.book_system.dto.UserDto;
import com.kaua.book_system.entity.Reservation;
import com.kaua.book_system.entity.Room;
import com.kaua.book_system.entity.User;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public Reservation toEntity(ReservationDto reservationDto, Room room, User user){
      return new Reservation(
              null,
              user,
              room,
              reservationDto.hourStart(),
              reservationDto.hourEnd(),
              reservationDto.execTime(),
              reservationDto.status()
      );
    };

    public ReservationDto toDto(Reservation reservation){
        return new ReservationDto(
                reservation.getId(),
                reservation.getUser(),
                reservation.getRoom(),
                reservation.getHourStart(),
                reservation.getHourEnd(),
                reservation.getExecTime(),
                reservation.getStatus()
        );
    }
}
