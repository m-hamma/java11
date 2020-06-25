package com.hamma;
public class UserDao implements Dao<User> {
 
    private final Map<Integer, User> users;
 
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