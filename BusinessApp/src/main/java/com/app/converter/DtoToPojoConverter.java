package com.app.converter;

import org.modelmapper.ModelMapper;

import com.app.dto.UserDTO;
import com.app.pojo.User;

public class DtoToPojoConverter {

    private static ModelMapper modelMapper = new ModelMapper();
    
	private DtoToPojoConverter() {
		throw new IllegalStateException("This is utility class");
	}
	
	public static User convert(UserDTO userDto) {
		return modelMapper.map(userDto, User.class);
	}
}