package com.store.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.UUID;

public class Role {

    @Id
    private UUID id;
    private String name;
    private String Description;

    private ArrayList<Permission> permissions;
}
