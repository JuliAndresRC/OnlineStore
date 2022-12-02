package com.store.api;

import com.store.DTO.KartDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/orders")
public interface OrderAPI {

    @PostMapping
    KartDTO createOrder(@RequestBody KartDTO orderDTO);

    @DeleteMapping("/{orderId}")
    void deleteOrder(@PathVariable UUID orderId);
    @GetMapping("/{orderId}")
    KartDTO getOrder(@PathVariable UUID orderId);

    @GetMapping("/all/{userId}")
    List<KartDTO> getByUser(@PathVariable UUID userId);

    @GetMapping
    List<KartDTO> getAllOrders();

}
