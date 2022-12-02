package com.store.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private UUID id;

    @NotNull(message = "Por favor introducir el Nombre del producto")
    @NotBlank(message = "Por favor introducir el Nombre del producto")
    private String name;

    @NotNull(message = "Por favor introducir la descripcion del producto")
    @NotBlank(message = "Por favor introducir la descripcion del producto")
    private String description;

    @NotNull(message = "Por favor introducir el precio del producto")
    @Positive(message = "El precio debe de ser mayor a 0")
    private double price;

}