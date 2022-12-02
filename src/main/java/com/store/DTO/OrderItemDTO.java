package com.store.DTO;

import com.store.model.Item;
import com.store.model.Order;
import lombok.Data;

import java.util.UUID;

@Data
public class OrderItemDTO {

    private UUID id;
    private int quantity;
    private Item item;
    private Order order;
}
