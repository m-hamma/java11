package com.hamma.dtos;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String name;
	private String email;

}
