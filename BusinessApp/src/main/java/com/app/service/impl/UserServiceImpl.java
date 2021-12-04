package com.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.converter.DtoToPojoConverter;
import com.app.converter.PojoToDtoConverter;
import com.app.dto.UserDTO;
import com.app.exceptions.AuthenticationException;
import com.app.pojo.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDTO getUserById(Long userId) {
		return PojoToDtoConverter.convert(userRepository.getOne(userId));
	}
	
	@Override
	public List<UserDTO> getAllUsers() {
		List<User> users = userRepository.findAll();
		List<UserDTO> userList = new ArrayList<>();
		for (User user : users) {
			userList.add(PojoToDtoConverter.convert(user));
		}
		return userList;
	}

	@Override
	public UserDTO addUser(UserDTO userDto) {
		return PojoToDtoConverter.convert(userRepository.save(DtoToPojoConverter.convert(userDto)));
	}

	@Override
	public UserDTO updateUser(UserDTO userDto) {
		User user = userRepository.getOne(userDto.getId());
		if(user.getId() != null) {
			user.setName(userDto.getName());
			return PojoToDtoConverter.convert(userRepository.save(user));
		} else {
			return null;
		}
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public UserDTO loginUser(UserDTO userDto) throws AuthenticationException {
		
		User user = userRepository.getUserByEmailIdAndPassword(userDto.getEmailId(), userDto.getPassword());
		if(user != null) {
			return PojoToDtoConverter.convert(user);
		} else {
			throw new AuthenticationException("Invalid username or password");
		}
	}
}