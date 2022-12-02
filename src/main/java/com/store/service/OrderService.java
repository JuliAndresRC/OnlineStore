package com.store.service;


import com.store.DTO.KartDTO;
import com.store.model.Order;
import com.store.model.User;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    void createOrder(User user, KartDTO kartDTO);

    List<Order> getOrdersByUserId(UUID userId);

    public List<Order> getOrders();

    void removeOrder(UUID orderId);
}
