package com.hamma.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private String firstName;

    public User(String name) {
        this.name = name;
    }
}