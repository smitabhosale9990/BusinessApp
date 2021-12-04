package com.app.service;

import java.util.List;
import com.app.dto.UserDTO;
import com.app.exceptions.AuthenticationException;

public interface UserService {

	UserDTO getUserById(Long userId);
	
	List<UserDTO> getAllUsers();

	UserDTO addUser(UserDTO userDto);

	UserDTO updateUser(UserDTO userDto);

	void deleteUserById(Long userId);

	UserDTO loginUser(UserDTO userDto) throws AuthenticationException;
}
