package com.store.DTO;

import com.store.model.Item;
import com.store.model.Order;

import java.util.UUID;

public class OrderItemDTO {

    private UUID id;
    private int quantity;
    private Item item;
    private Order order;
}
