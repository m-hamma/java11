package com.hamma;
public interface Dao<T> {
    Optional<T> findById(int id);
    List<T> findAll();
 
}