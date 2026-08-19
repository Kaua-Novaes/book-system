package com.kaua.book_system.controller;


import com.kaua.book_system.dto.room.RoomRequestDto;
import com.kaua.book_system.dto.room.RoomResponseDto;
import com.kaua.book_system.dto.user.UserRequestDto;
import com.kaua.book_system.dto.user.UserResponseDto;
import com.kaua.book_system.services.RoomService;
import com.kaua.book_system.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto){
        UserResponseDto user =  userService.saveUser(userRequestDto);
        System.out.println(user.username());
        return ResponseEntity.ok(user);
    }
}
