package com.app.service;

import com.app.dto.UserDTO;

public interface UserService {

	UserDTO getUserById(Long userId);

	UserDTO addUser(UserDTO userDto);

	UserDTO updateUser(UserDTO userDto);

	void deleteUserById(Long userId);
}
