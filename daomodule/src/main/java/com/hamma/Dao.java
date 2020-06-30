package com.hamma;
public interface Dao<T> {
    Optional<T> findById(int id);
    //test
    List<T> findAll();
 
}