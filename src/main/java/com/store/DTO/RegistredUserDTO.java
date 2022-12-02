package com.store.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.store.model.Role;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistredUserDTO {

    private UUID id;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

    private Role role;
}
