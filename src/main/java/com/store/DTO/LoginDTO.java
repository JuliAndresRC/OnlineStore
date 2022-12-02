package com.store.DTO;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class LoginDTO {

    @NotNull(message = "Por favor introducir el email")
    private String email;

    @NotNull(message = "Por favor introducir el password")
    private String password;
}