package com.health.main.exception;

public class EmailIdAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailIdAlreadyExistsException(String message) {
		super(message);
	}
}
