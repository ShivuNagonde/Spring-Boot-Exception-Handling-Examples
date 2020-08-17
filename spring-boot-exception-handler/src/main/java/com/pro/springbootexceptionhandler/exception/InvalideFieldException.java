package com.pro.springbootexceptionhandler.exception;

public class InvalideFieldException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	private String message;

	public InvalideFieldException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
