package com.hamma.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
 
    private String name;
    private String firstName;
    private String email;
    // standard constructor / getter / toString
 
}