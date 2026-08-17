package com.kaua.book_system.controller;


import com.kaua.book_system.dto.room.RoomRequestDto;
import com.kaua.book_system.dto.room.RoomResponseDto;
import com.kaua.book_system.entity.Room;
import com.kaua.book_system.services.RoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<RoomResponseDto> createRoom(@RequestBody RoomRequestDto roomRequestDto){
        System.out.println(roomRequestDto.name());
        RoomResponseDto room =  roomService.saveRoom(roomRequestDto);
        return ResponseEntity.ok(room);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable Long id){
        roomService.deleteRoom(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("")
    public ResponseEntity<List<RoomResponseDto>> listAllRooms(){
        List<RoomResponseDto> rooms = roomService.listAllRooms();
        return ResponseEntity.ok(rooms);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRoom(@PathVariable Long id){
        RoomResponseDto room = roomService.getRoom(id);
        return ResponseEntity.ok(room);
    }



}
