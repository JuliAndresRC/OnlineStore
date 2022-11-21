package com.store.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Permission {

    @Id
    private UUID id;
    private String URI;
    private String key;
}
