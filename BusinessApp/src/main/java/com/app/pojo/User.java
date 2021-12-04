package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BasePojo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long 	id;
	
	@Column(name = "name")
	private String 	name;
	
	@Column(name = "email")
	private String 	emailId;
	
	@Column(name = "password")
	private String 	password;
	
	public User() {
	}

	public User(Long id, String name, String emailId, String password) {
		super();
		this.id = id;
		this.name = name;
		this.emailId  = emailId;
		this.password = password;
	}

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}