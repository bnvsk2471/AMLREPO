package com.aml.myControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.aml.exception.CustomerDetailsNotFound;

@ControllerAdvice
public class MyControllerAdvice{
	
	@ExceptionHandler(CustomerDetailsNotFound.class)
	public ResponseEntity<String> handleEmptyInput(CustomerDetailsNotFound emptyinputexception){
		return new ResponseEntity<String>("Customer details not found for the given Id",HttpStatus.BAD_REQUEST);
	}
	

}
