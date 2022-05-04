package com.hamma.mapper;

import com.hamma.dtos.UserDto;
import com.hamma.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
	@Mapping(source = "name", target = "name")
    @Mapping(source = "firstName", target = "firstName")
    User toEtity (UserDto userDto);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "firstName", target = "firstName")
    UserDto toDto(User user);
}
