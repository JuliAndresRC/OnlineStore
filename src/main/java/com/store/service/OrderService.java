package com.store.service;


import com.store.model.Order;
import com.store.model.User;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    void createOrder(User user);

    List<Order> getOrdersByUserId(UUID userId);

    void removeOrder(UUID orderId);
}
