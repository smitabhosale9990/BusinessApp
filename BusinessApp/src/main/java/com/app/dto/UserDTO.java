package com.app.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{
	
	private static final long serialVersionUID = 3981841363893495308L;
	private Long 	id;
	private String 	name;
	private String 	emailId;
	private String 	password;
	
	public UserDTO() {
	}

	public UserDTO(Long id, String name, String emailId, String password) {
		super();
		this.id = id;
		this.name = name;
		this.emailId  = emailId;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}