package com.store.service;

import com.store.model.Item;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.UUID;

public interface ItemService {

    ArrayList<Item> items();

    Item getByID(@PathVariable UUID itemId);

    Item addItem(@RequestBody Item item);

    void modifyItem(@RequestBody UUID itemID, Item item);
}
