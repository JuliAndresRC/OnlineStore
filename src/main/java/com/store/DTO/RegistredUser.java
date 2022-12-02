package com.store.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.store.model.Role;

import java.util.UUID;

@Data
@AllArgsConstructor
public class RegistredUser {

    private UUID id;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

    private Role role;
}
