package com.app.converter;

import org.modelmapper.ModelMapper;

import com.app.dto.UserDTO;
import com.app.pojo.User;

public class PojoToDtoConverter {

	private static ModelMapper modelMapper = new ModelMapper();
	
	private PojoToDtoConverter() {
	    throw new IllegalStateException("This is utility class");
	  }

	public static UserDTO convert(User user) {
		return modelMapper.map(user, UserDTO.class);
	}
}