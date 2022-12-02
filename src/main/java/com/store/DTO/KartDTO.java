package com.store.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Data
public class KartDTO {

    private UUID id;
    private List<OrderItemDTO> items;

    private double total;
}
