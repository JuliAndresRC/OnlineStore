package com.store.DTO;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class LoginDTO {

    @NotNull(message = "The email or phone number cannot be null.")
    private String emailPhone;

    @NotNull(message = "Attribute 'password' cannot be null.")
    private String password;
}