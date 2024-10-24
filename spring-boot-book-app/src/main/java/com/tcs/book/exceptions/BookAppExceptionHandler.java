package com.tcs.book.exceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookAppExceptionHandler {
	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<String> bookNotFoundException(BookNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public ResponseEntity<String> emptyResultException(EmptyResultDataAccessException ex){
		return new ResponseEntity<String>("book not found...",HttpStatus.NOT_FOUND);
	}
}
