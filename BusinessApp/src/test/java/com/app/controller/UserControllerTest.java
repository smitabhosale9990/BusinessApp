package com.app.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;

import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.app.dto.UserDTO;
import com.app.service.UserService;


@RunWith(MockitoJUnitRunner.class)
class UserControllerTest {
	
	@Mock
	UserService  userService;
	
	@InjectMocks
	UserController userController;
	
	@BeforeEach
	public void init() { 
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void getUserById() {
		when(userService.getUserById(2L)).thenReturn(new UserDTO(2L, "Smita", "smita@gmail.com", "123"));
		UserDTO userDto = userController.getUserById(2L);
		assertNotNull(userDto);
		assertEquals("Smita", userDto.getName());
	}
}