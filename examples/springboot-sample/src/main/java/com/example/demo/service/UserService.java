package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<UserDto> findAll() {
        return List.of();
    }

    public UserDto findById(Long id) {
        return new UserDto(id, "Sample User");
    }

    public UserDto create(UserDto request) {
        return request;
    }
}
