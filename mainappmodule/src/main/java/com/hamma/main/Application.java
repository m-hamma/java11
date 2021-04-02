package com.hamma.main;

import java.util.HashMap;
import java.util.Map;
import com.hamma.mapper.UserMapper;

import com.hamma.dao.Dao;
import com.hamma.dtos.UserDto;
import com.hamma.entity.User;
import com.hamma.udao.UserDao;
import org.mapstruct.factory.Mappers;

//mvn -q clean compile exec:java -Dexec.mainClass="com.hamma.main.Application"
public class Application {
	private static UserMapper mapper = Mappers.getMapper(UserMapper.class);
	
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        
        final User user1=new User();
        user1.setName("POP");
        user1.setFirstName("Julie");
        final User user2=new User();
        user2.setName("POPI");
        user2.setFirstName("Pepa");
        
        users.put(1,user1);
        users.put(2, user2);
        
        Dao<User> userDao = new UserDao(users);
        userDao.findAll().forEach(e->{
        	UserDto userDto = mapper.toDto(e);
        	System.out.println(userDto.getName()+ "------"+userDto.getFirstName());
        });
    }   
}