package com.kaua.book_system.services;

import com.kaua.book_system.dto.room.create.RoomCreateRequestDto;
import com.kaua.book_system.dto.room.create.RoomCreateResponseDto;
import com.kaua.book_system.entity.Room;
import com.kaua.book_system.mapper.RoomMapper;
import com.kaua.book_system.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper;

    public RoomService(RoomRepository roomRepository, RoomMapper roomMapper){
        this.roomMapper = roomMapper;
        this.roomRepository = roomRepository;
    };

    public RoomCreateResponseDto saveRoom(RoomCreateRequestDto roomCreateRequestDto){
        Room room = roomMapper.toEntity(roomCreateRequestDto);
        roomRepository.save(room);
        return roomMapper.toReturnDto(room);
    };

    public
}
