package com.hamma.userdao;

import com.hamma.dao.Dao;
import com.hamma.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
public class UserDao implements Dao<User> {
    private Map<Integer, User> users;
    public UserDao() {
    }
    public UserDao(Map<Integer, User> users) {
        this.users = users;
    }
    // standard constructor
 
    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }
 
    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}