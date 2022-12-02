package com.store.service.impl;

import com.store.model.Item;
import com.store.repository.ItemRepository;
import com.store.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public ArrayList<Item> items() {
        return (ArrayList<Item>) StreamSupport.stream(itemRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public Item getByID(UUID itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }

    @Override
    public void modifyItem(UUID itemID, Item item) {

        Item im = getByID(itemID);

        im.setDescription(item.getDescription());
        im.setName(item.getName());
        im.setPrice(item.getPrice());
        im.setImage(item.getImage());

    }

    @Override
    public void removeItem(UUID itemID) {
        itemRepository.delete(getByID(itemID));
    }
}
