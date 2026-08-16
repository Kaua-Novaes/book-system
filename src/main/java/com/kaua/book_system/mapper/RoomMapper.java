package com.kaua.book_system.mapper;

import com.kaua.book_system.dto.room.create.RoomCreateRequestDto;
import com.kaua.book_system.dto.room.create.RoomCreateResponseDto;
import com.kaua.book_system.entity.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public Room toEntity(RoomCreateRequestDto roomCreateRequestDto){
        return new Room(
                null,
                roomCreateRequestDto.name(),
                roomCreateRequestDto.disponibility(),
                roomCreateRequestDto.description(),
                roomCreateRequestDto.capacityMax(),
                roomCreateRequestDto.hourOpen(),
                roomCreateRequestDto.hourClose()
        );
    }

    public RoomCreateRequestDto toDto(Room room){
        return new RoomCreateRequestDto(
                room.getName(),
                room.getDisponibility(),
                room.getDescription(),
                room.getCapacityMax(),
                room.getHourOpen(),
                room.getHourClose()
        );
    }

    public RoomCreateResponseDto toReturnDto(Room room){
        return new RoomCreateResponseDto(
                room.getId(),
                "Sala criada com sucesso"
        );
    }
}
