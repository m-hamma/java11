package com.hamma.dao;
public interface Dao<T> {
    java.util.Optional<T> findById(int id);
    //test
    java.util.List<T> findAll();
 
}