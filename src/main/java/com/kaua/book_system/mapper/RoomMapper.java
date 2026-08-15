package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.RoomDto;
import com.kaua.book_system.entity.Room;

public class RoomMapper {

    public Room toEntity(RoomDto roomDto){
        return new Room(
                null,
                roomDto.name(),
                roomDto.disponibility(),
                roomDto.description(),
                roomDto.capacityMax(),
                roomDto.hourOpen(),
                roomDto.hourClose()
        );
    }

    public RoomDto toDto(Room room){
        return new RoomDto(
                room.getId(),
                room.getName(),
                room.getDisponibility(),
                room.getDescription(),
                room.getCapacityMax(),
                room.getHourOpen(),
                room.getHourClose()
        );
    }
}
