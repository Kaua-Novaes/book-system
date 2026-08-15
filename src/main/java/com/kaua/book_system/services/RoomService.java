package com.kaua.book_system.services;

import com.kaua.book_system.dto.room.RoomRequestDto;
import com.kaua.book_system.dto.room.RoomReturnDto;
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

    public RoomReturnDto saveRoom(RoomRequestDto roomRequestDto){
        Room room = roomMapper.toEntity(roomRequestDto);
        roomRepository.save(room);
        return roomMapper.toReturnDto(room);
    };
}
