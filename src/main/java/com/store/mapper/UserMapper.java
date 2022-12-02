package com.store.mapper;

import com.store.DTO.RegistredUserDTO;
import com.store.DTO.UserDTO;
import com.store.model.Order;
import com.store.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromUserDTO (UserDTO userDTO);

    UserDTO formUser (User user);

    User fromDTO(RegistredUserDTO userDTO);
}
