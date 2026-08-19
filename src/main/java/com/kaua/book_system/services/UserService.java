package com.kaua.book_system.services;

import com.kaua.book_system.dto.user.UserRequestDto;
import com.kaua.book_system.dto.user.UserResponseDto;
import com.kaua.book_system.entity.User;
import com.kaua.book_system.mapper.UserMapper;
import com.kaua.book_system.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    public UserResponseDto saveUser(UserRequestDto userDto){
        User user = userMapper.toEntity(userDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return userMapper.toDto(user);
    }



}
