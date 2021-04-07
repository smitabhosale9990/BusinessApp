package com.app.converter;

import com.app.dto.UserDTO;
import com.app.pojo.User;

public class DtoToPojoConverter {

	private DtoToPojoConverter() {
		throw new IllegalStateException("This is utility class");
	}
	
	public static User convert(UserDTO userDto) {
		return new User(userDto.getId(), userDto.getName());
	}
}