package com.ragalzi.prenotazioni.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityExistsException;

@ControllerAdvice
public class MyException extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(EntityExistsException.class)
	public ResponseEntity<String> gestoreEntityexistException(EntityExistsException e){
	return	new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
}
