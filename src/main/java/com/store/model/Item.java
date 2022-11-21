package com.store.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Item {

    @Id
    private UUID id;
    private String name;
    private String description;
    private double price;
    private String image;
}
