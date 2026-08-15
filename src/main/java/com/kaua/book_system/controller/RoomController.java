package com.kaua.book_system.controller;


import com.kaua.book_system.dto.room.RoomRequestDto;
import com.kaua.book_system.dto.room.RoomReturnDto;
import com.kaua.book_system.entity.Room;
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
    public ResponseEntity<?> createRoom(@RequestBody RoomRequestDto roomRequestDto){
        System.out.println(roomRequestDto.name());
        RoomReturnDto room =  roomService.saveRoom(roomRequestDto);
        return ResponseEntity.ok(room);
    }
}
