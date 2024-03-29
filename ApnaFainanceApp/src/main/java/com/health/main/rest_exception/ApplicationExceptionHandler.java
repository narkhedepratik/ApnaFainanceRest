package com.health.main.rest_exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.health.main.exception.EmailIdAlreadyExistsException;

import com.health.main.exception.InvalidAuthDetailsException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(InvalidAuthDetailsException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ResponseEntity<String> handleInvalidAuthDetailsException(InvalidAuthDetailsException e){
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
	}
	
	@ExceptionHandler(EmailIdAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ResponseEntity<String> handleEmailIdAlreadyExistsException(EmailIdAlreadyExistsException e){
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
	}
	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ResponseEntity<String> handleEnquiryIdNullException(EnquiryIdNullException e){
//		
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//	}
//	
}
