package com.store.mapper;

import com.store.DTO.PermissionDTO;
import com.store.model.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    Permission fromPermissionDTO(PermissionDTO permissionDTO);

    PermissionDTO fromPermission(Permission permission);
}
