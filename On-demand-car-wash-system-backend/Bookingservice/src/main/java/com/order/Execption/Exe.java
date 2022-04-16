package com.order.Execption;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Exe  extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<?> handler(CustomException ex)
	{
	return ResponseEntity.badRequest().body(ex.getMessage());
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<?> handle(NoSuchElementException ex)
	{
	return ResponseEntity.badRequest().body("no such user");
	}
}
