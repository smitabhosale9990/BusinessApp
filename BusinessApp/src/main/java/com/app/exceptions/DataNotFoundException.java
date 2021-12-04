package com.app.exceptions;

public class DataNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 6449574471751264044L;
	
	private final String message;
	
	public DataNotFoundException() {
		message = null;
	}
	
	public DataNotFoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
