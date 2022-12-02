package com.store.service.impl;

import com.store.DTO.KartDTO;
import com.store.DTO.OrderItemDTO;
import com.store.model.Order;
import com.store.model.User;
import com.store.repository.OrderRepository;
import com.store.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public void createOrder(User user, KartDTO cartDTO) {

        orderRepository.save(Order.builder().total(calculateTotalPrice(cartDTO)).status("CREADA").user(user).build());
    }

    @Override
    public List<Order> getOrdersByUserId(UUID userId) {

        return orderRepository.findByUserId(userId).orElse(null);
    }

    @Override
    public void removeOrder(UUID orderId) {

        if(orderRepository.findById(orderId).orElse(Order.builder().status("NO EXISTE").build()).getStatus().
                equals("CREADA")) {

            orderRepository.deleteById(orderId);
        }
    }

    @Override
    public List<Order> getOrders(){
        return StreamSupport.stream(orderRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }


    private double calculateTotalPrice(KartDTO kartDTO) {

        double totalprice = 0;

        for (OrderItemDTO orderItemDTO: kartDTO.getItems()) {

            totalprice += orderItemDTO.getItem().getPrice() * orderItemDTO.getQuantity();

        }
        return totalprice;
    }
}