package com.store.controller;

import com.store.DTO.KartDTO;
import com.store.api.OrderAPI;
import com.store.mapper.OrderMapper;
import com.store.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class OrderController implements OrderAPI {

    @Override
    public KartDTO createOrder(KartDTO orderDTO) {
        return null;
    }

    @Override
    public void deleteOrder(UUID orderId) {

    }

    @Override
    public KartDTO getOrder(UUID orderId) {
        return null;
    }

    @Override
    public List<KartDTO> getByUser(UUID userId) {
        return null;
    }

    @Override
    public List<KartDTO> getAllOrders() {
        return null;
    }
}
