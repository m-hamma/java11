package com.hamma.udao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.hamma.dao.Dao;
import com.hamma.entity.User;



public class UserDao implements Dao<User> {
 
    private Map<Integer, User> users;
    
    // standard constructor
 
    public UserDao(Map<Integer, User> users2) {
		this.users = users2;
	}



	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }
 
   

	@Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}