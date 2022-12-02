package com.store.mapper;

import com.store.DTO.ItemDTO;
import com.store.model.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item fromItemDTO(ItemDTO itemDTO);

    ItemDTO fromItem(Item item);
}
