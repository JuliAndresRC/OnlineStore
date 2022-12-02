package com.store.DTO;

import com.store.validation.CustomAnnotations;
import com.store.validation.CustomAnnotations.NameValidation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private UUID id;

    @NotBlank(message = "Por favor introducir el email")
    @CustomAnnotations.EmailValidation
    private String email;

    @NotNull
    private String phoneNumber;

    @Size(min = 1, max = 120)
    @NameValidation
    private String firstName;

    @NotNull
    @Size(min = 1, max = 120)
    private String lastName;

    @NotNull(message = "Por favor introducir la contraseña")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).+$", message = "La contraseña debe de contener caracteres alfanumericos")
    private String password;

    private String address;

    private RoleDTO role;

}