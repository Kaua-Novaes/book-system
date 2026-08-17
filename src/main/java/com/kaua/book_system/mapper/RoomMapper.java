package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.room.RoomRequestDto;
import com.kaua.book_system.dto.room.RoomResponseDto;
import com.kaua.book_system.entity.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public Room toEntity(RoomRequestDto roomRequestDto){
        return new Room(
                null,
                roomRequestDto.name(),
                roomRequestDto.disponibility(),
                roomRequestDto.description(),
                roomRequestDto.capacityMax(),
                roomRequestDto.hourOpen(),
                roomRequestDto.hourClose()
        );
    }

    public RoomResponseDto toDto(Room room){
        return new RoomResponseDto(
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
