package com.store.mapper;

import com.store.DTO.KartDTO;
import com.store.DTO.RegistredUserDTO;
import com.store.DTO.UserDTO;
import com.store.model.Order;
import com.store.model.User;

public interface OrderMapper {

    User fromDTO (KartDTO orderDTO);

    UserDTO fromOrder (Order order);
}
