package com.store.controller;

import com.store.DTO.RegistredUserDTO;
import com.store.DTO.UserDTO;
import com.store.api.UserAPI;
import com.store.mapper.UserMapper;
import com.store.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.*;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class UserController implements UserAPI {


    public final UserService userService;
    public final UserMapper userMapper;


    @Override
    public UserDTO getUser(UUID userId) {
        return userMapper.formUser(userService.getUser(userId));
    }

    @Override
    public UserDTO createUser(@Valid RegistredUserDTO userDTO) {
        return userMapper.formUser(userService.createUser(userMapper.fromDTO(userDTO), userDTO.getRole().getRoleId()));
    }

    @Override
    public List<UserDTO> getUsers() {
        return userService.getUsers().stream().map(userMapper::formUser).collect(Collectors.toList());
    }

}
