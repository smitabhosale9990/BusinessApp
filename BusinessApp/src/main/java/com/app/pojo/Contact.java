package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact extends BasePojo{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "mobileNumber1")
	private String mobileNumber1;
	
	@Column(name = "mobileNumber2")
	private String mobileNumber2;
	
	@Column(name = "emailId1")
	private String emailId1;
	
	@Column(name = "emailId2")
	private String emailId2;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMobileNumber1() {
		return mobileNumber1;
	}
	public void setMobileNumber1(String mobileNumber1) {
		this.mobileNumber1 = mobileNumber1;
	}
	public String getMobileNumber2() {
		return mobileNumber2;
	}
	public void setMobileNumber2(String mobileNumber2) {
		this.mobileNumber2 = mobileNumber2;
	}
	public String getEmailId1() {
		return emailId1;
	}
	public void setEmailId1(String emailId1) {
		this.emailId1 = emailId1;
	}
	public String getEmailId2() {
		return emailId2;
	}
	public void setEmailId2(String emailId2) {
		this.emailId2 = emailId2;
	}
}