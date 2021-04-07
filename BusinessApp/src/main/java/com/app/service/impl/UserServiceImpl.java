package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.converter.DtoToPojoConverter;
import com.app.converter.PojoToDtoConverter;
import com.app.dto.UserDTO;
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
}