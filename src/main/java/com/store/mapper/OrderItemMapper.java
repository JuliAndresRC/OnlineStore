package com.store.mapper;

import com.store.DTO.OrderItemDTO;
import com.store.model.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    OrderItem fromOrderItemDTO(OrderItemDTO orderItemDTO);

    OrderItemDTO fromOrderItem(OrderItem orderItem);
}
