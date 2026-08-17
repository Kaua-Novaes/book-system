package com.kaua.book_system.services;

import com.kaua.book_system.dto.room.RoomRequestDto;
import com.kaua.book_system.dto.room.RoomResponseDto;
import com.kaua.book_system.entity.Room;
import com.kaua.book_system.mapper.RoomMapper;
import com.kaua.book_system.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper;

    public RoomService(RoomRepository roomRepository, RoomMapper roomMapper){
        this.roomMapper = roomMapper;
        this.roomRepository = roomRepository;
    };

    public RoomResponseDto saveRoom(RoomRequestDto roomRequestDto){
        Room room = roomMapper.toEntity(roomRequestDto);
        roomRepository.save(room);
        return roomMapper.toDto(room);
    };

    public void deleteRoom(Long id){
        Optional<Room> room = roomRepository.findById(id);

        if (room.isEmpty()){
            throw new RuntimeException("Room not find");
        }

        roomRepository.deleteById(id);

    };

    public List<RoomResponseDto> listAllRooms(){

        return roomRepository.findAll()
                .stream()
                .map(roomMapper::toDto)
                .toList();
    }


}
