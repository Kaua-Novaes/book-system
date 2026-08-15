package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.room.RoomRequestDto;
import com.kaua.book_system.dto.room.RoomReturnDto;
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

    public RoomRequestDto toDto(Room room){
        return new RoomRequestDto(
                room.getName(),
                room.getDisponibility(),
                room.getDescription(),
                room.getCapacityMax(),
                room.getHourOpen(),
                room.getHourClose()
        );
    }

    public RoomReturnDto toReturnDto(Room room){
        return new RoomReturnDto(
                room.getId(),
                "Sala criada com sucesso"
        );
    }
}
