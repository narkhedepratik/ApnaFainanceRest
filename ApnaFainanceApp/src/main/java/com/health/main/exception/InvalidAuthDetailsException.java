package com.health.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidAuthDetailsException extends RuntimeException {
	
	public InvalidAuthDetailsException(String message) {
		super(message);
	}

	
}
