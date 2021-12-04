package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.UserDTO;
import com.app.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/ba/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController{
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	@Operation(summary = "Operation to get user by Id")
	@ApiResponse(description = "User with given ID found successfully", responseCode = "200")
	@ApiResponse(description = "User with given ID not found", responseCode = "500")
	public UserDTO getUserById(@PathVariable(value = "id")Long userId) {
		return userService.getUserById(userId);
	}
	
	@GetMapping("/getAllUsers")
	@Operation(summary = "Operation to get all users")
	@ApiResponse(description = "User list found successfully", responseCode = "200")
	@ApiResponse(description = "User list not found", responseCode = "500")
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/add")
	public UserDTO addUser(@RequestBody UserDTO userDto) {
		return userService.addUser(userDto);
	}
	
	@PutMapping("/update")
	public UserDTO updateUser(@RequestBody UserDTO userDto) {
		return userService.updateUser(userDto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable (value = "id") Long userId) {
		userService.deleteUserById(userId);
	}
	
	@PostMapping("/login")
	public UserDTO loginUser(@RequestBody UserDTO userDto) throws Exception {
		return userService.loginUser(userDto);
	}
}