package com.app.converter;

import com.app.dto.UserDTO;
import com.app.pojo.User;

public class PojoToDtoConverter {

	private PojoToDtoConverter() {
	    throw new IllegalStateException("This is utility class");
	  }

	public static UserDTO convert(User user) {
		return new UserDTO(user.getId(), user.getName());
	}
}