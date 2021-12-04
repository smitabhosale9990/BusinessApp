package com.app.exceptions;

public class AuthenticationException extends RuntimeException {
	
	private static final long serialVersionUID = 7303833758963381045L;
	
	private final String message;
	
	public AuthenticationException() {
		message = null;
	}
	
	public AuthenticationException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}