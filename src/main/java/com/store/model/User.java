package com.store.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.UUID;

public class User {

    @Id
    private UUID id;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;

    private Role role;
    private ArrayList<Order> orders;
}
