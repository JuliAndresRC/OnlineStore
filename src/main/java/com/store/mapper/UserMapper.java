package com.store.mapper;

import com.store.DTO.UserDTO;
import com.store.model.Order;
import com.store.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromDTO (UserDTO userDTO);

    UserDTO formUser (User user);

}
