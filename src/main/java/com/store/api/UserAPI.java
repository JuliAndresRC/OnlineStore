package com.store.api;

import com.store.DTO.RegistredUserDTO;
import com.store.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/users")
public interface    UserAPI {

    @GetMapping("/{userId}")
    UserDTO getUser(@PathVariable UUID userId);

    @PostMapping()
    UserDTO createUser(@RequestBody RegistredUserDTO userDTO);

    @GetMapping
    List<UserDTO> getUsers();
}
