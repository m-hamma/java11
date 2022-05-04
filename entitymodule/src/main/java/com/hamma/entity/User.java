package com.hamma.entity;

//@Data
public class User {
    public User(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    // standard constructor / getter / toString
 
}