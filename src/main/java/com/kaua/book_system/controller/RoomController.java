package com.kaua.book_system.controller;


import com.kaua.book_system.dto.room.create.RoomCreateRequestDto;
import com.kaua.book_system.dto.room.create.RoomCreateResponseDto;
import com.kaua.book_system.services.RoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<?> createRoom(@RequestBody RoomCreateRequestDto roomCreateRequestDto){
        System.out.println(roomCreateRequestDto.name());
        RoomCreateResponseDto room =  roomService.saveRoom(roomCreateRequestDto);
        return ResponseEntity.ok(room);
    }
}
