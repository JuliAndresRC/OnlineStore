package com.store.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.UUID;

public class Order {

    @Id
    private UUID id;
    private double total;
    private String status;

    private ArrayList<OrderItem> orderItems;
}
