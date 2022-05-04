package com.hamma.main;

import java.util.HashMap;
import java.util.Map;
import com.hamma.dao.Dao;
import com.hamma.entity.User;
import com.hamma.userdao.UserDao;
public class Application {
     
    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        Dao userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    }   
}